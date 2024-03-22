public class OrderProcessing {
    public void processOrder(Order order) {
        // Code for order processing 
        System.out.println("Processing order for user: " + order.getUser());
        System.out.println("Ordered item: " + order.getItem());
        System.out.println("Quantity: " + order.getQuantity());
        System.out.println("Total amount: $" + order.getTotalAmount());
        System.out.println("Order processed successfully.");
    }
}
