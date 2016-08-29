/**
 * Created by Adam Cowie on 29/08/2016.
 */
public class Billing {
    public static void main(String args[]) {
        double price = 10.00;
        int quanity = 2;
        double coupon = 1.00;
        Billing test = new Billing();
        System.out.println(test.computeBill(price));
        System.out.println(test.computeBill(price, quanity));
        System.out.println(test.computeBill(price, quanity, coupon));
    }

    public double computeBill(double price) {
        return price * 1.08;
    }

    public double computeBill(double price, int quanity) {
        return computeBill(price * quanity);
    }

    public double computeBill(double price, int quanity, double coupon) {
        return computeBill((price * quanity) - coupon);
    }
}