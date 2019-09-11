

public class ReportService {


    public Double generateReport(int value) {

        return value * TaxPolicy.taxPolicy();
    }

}
