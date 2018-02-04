public class Order {
    private static int cash;
    private String name;
    protected static String status = "normalPay";

    public Order(int cash, String name) {
        this.cash = cash;
        this.name = name;
    }

    public static int getCash() {
        return cash;
    }
}
