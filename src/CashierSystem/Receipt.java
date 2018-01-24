
package CashierSystem;

public class Receipt extends Variants {
    
    private double subtotal;
    private double totalTax;
    private Items  item;
    private int quantity;
    private int sizeType;

    public Receipt() {
    }

    public Receipt(double subtotal, double totalTax,int quantity,int sizeType, Items item) {
        this.subtotal = subtotal;
        this.totalTax = totalTax;
        this.quantity = quantity;
        this.sizeType = sizeType ;
        this.item = item;
    }   

    public int getSizeType() {
        return sizeType;
    }

    public void setSizeType(int sizeType) {
        this.sizeType = sizeType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(int totalTax) {
        this.totalTax = totalTax;
    }

    public Items getItem() {
        return item;
    }

    public void setItem(Items item) {
        this.item = item;
    }    
}
