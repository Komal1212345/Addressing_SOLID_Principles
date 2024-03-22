public class PercentageDiscountStrategy implements DiscountStrategy {
    @Override
    public double calculateDiscount(Product product) {
        return product.getPrice() * 0.1; // 10% discount for all products
    }
}
