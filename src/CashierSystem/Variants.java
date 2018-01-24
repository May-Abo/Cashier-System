package CashierSystem;

public class Variants extends Items {

    private String size;
    private double price;
    private int tax_code;
    private String taxName;
    private double rate;

    public Variants() {
    }

    public Variants(int tax_code) {
        if (tax_code == 0) {
            this.taxName = "HST";
            this.rate = 0.13;
        } else if (tax_code == 1) {
            this.taxName = "HST - BOOKS";
            this.rate = 0.05;
        } else if (tax_code == 3) {
            this.taxName = "HST - Children's Clothing";
            this.rate = 0.05;
        } else if (tax_code == 4) {
            this.taxName = "HST - Children's Footwear";
            this.rate = 0.05;
        } else if (tax_code == 5) {
            this.taxName = "HST - Prepared Food < $4";
            this.rate = 0.05;
        } else if (tax_code == 7) {
            this.taxName = "EXEMPT - Food";
            this.rate = 0.0;
        }
    }

    public Variants(String size, double price, int tax_code) {
        this(tax_code);
        this.size = size;
        this.price = price;
        this.tax_code = tax_code;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTax_code() {
        return tax_code;
    }

    public void setTax_code(int tax_code) {
        this.tax_code = tax_code;
    }

    public String getTaxName() {
        return taxName;
    }

    public void setTaxName(String taxName) {
        this.taxName = taxName;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
