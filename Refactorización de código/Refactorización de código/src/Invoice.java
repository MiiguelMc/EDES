public class Invoice {
    private int invoiceNumber;
    private String customerName;
    private double subtotal;
    private double tax;

    public Invoice(int invoiceNumber, String customerName, double subtotal) {
        this.invoiceNumber = invoiceNumber;
        this.customerName = customerName;
        this.subtotal = subtotal;
        this.tax = subtotal * 0.15;
    }

    public void printInvoiceSummary() {
        System.out.println("Invoice Details:");
        System.out.println(String.format("Invoice Number: " , invoiceNumber));
        System.out.println(String.format("Customer Name: %d ", customerName) );
        System.out.println(String.format("Total Amount: %d" , subtotal));
        recalculateTax();
        System.out.println(String.format("Tax Amount: %d" , tax));
        System.out.println("Amount After tax " + getTotalAmountWithTax());
    }

    public void InvoiceDetails() {
        System.out.println("Invoice Number: " + invoiceNumber);
        System.out.println("Customer Name: " + customerName);
    }

    public void totalamount() {
        System.out.println("Total Amount: " + subtotal);
    }

    public void PrintTaxDetail() {
        System.out.println("Tax Amount: " + tax);
        System.out.println("Amount with Tax: " + (subtotal + tax));
    }

    public double calculatetax() {
        return subtotal * 0.15;
    }

    public double getTotalAmountWithTax() {
        return subtotal + tax;
    }

    public void updateCustomerName(String newName) {
        customerName = newName;
    }

    public void applyDiscountAndUpdateTax(double discountPercentage) {
        subtotal = subtotal - (subtotal * discountPercentage / 100);
        tax = subtotal * 0.15;
    }
private void recalculateTax(){
    tax=calculatetax();
}
    public void printDiscountDetails() {
        System.out.println("Discount Applied: " + subtotal);
        System.out.println("New Tax Amount: " + tax);
        System.out.println("Amount After Discount: " + (subtotal + tax));
    }
}