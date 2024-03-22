public class DiscountCalculator {
    public double calculateDiscount(Product product) {
        if (product.getType().equals("Book")) {
            return product.getPrice() * 0.1; // 10% discount for books
        } else if (product.getType().equals("Electronics")) {
            return product.getPrice() * 0.05; // 5% discount for electronics
        } else {
            return 0; // No discount for other product types
        }
    }
}
