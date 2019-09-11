package app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service_a.ReportService;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ReportController {

    private final AtomicLong counter = new AtomicLong();
    private service_a.ReportService reportService_a = new ReportService();
    private service_b.ReportService reportService_b = new service_b.ReportService();

    @RequestMapping("/report")
    public Report report( @RequestParam(value = "value") String value,
                          @RequestParam(value = "service") String service) {


        double tax = 0;
        switch (service) {
            case  "A":
                tax = reportService_a.generateReport(Integer.valueOf(value));
                break;

            case  "B":
                tax = reportService_b.generateReport(Integer.valueOf(value));
        }

        return new Report(counter.incrementAndGet(), value, tax, service);

    }
}
