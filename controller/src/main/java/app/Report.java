package app;



public class Report {

    private final long id;
    private final String amount;
    private final double tax;
    private String service;

    public Report(long id, String amount, double tax, String service) {
        this.id = id;
        this.amount = amount;
        this.tax = tax;
        this.service = service;
    }

    public long getId() {
        return id;
    }

    public String getAmount() {
        return amount;
    }

    public double getTax() {
        return tax;
    }

    public String getService() {
        return service;
    }

    @Override
    public String toString() {
        return "Report{" +
                "id=" + id +
                ", amount=" + amount +
                ", tax=" + tax +
                ", service='" + service + '\'' +
                '}';
    }
}
