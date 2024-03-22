public class UserAuthenticationAndOrderProcessing {
    // User authentication method
    public boolean authenticateUser(String username, String password) {
        // Simulating authentication logic
        if (username.equals("admin") && password.equals("password123")) {
            return true; // Authentication successful
        } else {
            return false; // Authentication failed
        }
    }
    
    // Order processing method
    public void processOrder(Order order) {
        // Simulating order processing logic
        System.out.println("Processing order for user: " + order.getUser());
        System.out.println("Ordered item: " + order.getItem());
        System.out.println("Quantity: " + order.getQuantity());
        System.out.println("Total amount: $" + order.getTotalAmount());
        System.out.println("Order processed successfully.");
    }
}
