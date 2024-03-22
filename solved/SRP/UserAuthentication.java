public class UserAuthentication {
    public boolean authenticateUser(String username, String password) {
        // Code for user authentication
        if (username.equals("admin") && password.equals("password123")) {
            return true; // Authentication successful
        } else {
            return false; // Authentication failed
        }
    }
}
