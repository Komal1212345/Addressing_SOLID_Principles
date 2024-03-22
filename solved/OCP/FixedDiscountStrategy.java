public class FixedDiscountStrategy implements DiscountStrategy {
    @Override
    public double calculateDiscount(Product product) {
        return 5; // $5 fixed discount for all products
    }
}
