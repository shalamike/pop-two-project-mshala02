import fraction.Fraction;
import fraction.FractionImpl;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        FractionImpl f1 = new FractionImpl("-3/7");
        FractionImpl f2 = new FractionImpl("2/4");

        System.out.println(f1);
        System.out.println(f2);

        System.out.println(f1.add(f2));
        System.out.println(f1.subtract(f2));
        System.out.println(f1.multiply(f2));
        System.out.println(f1.divide(f2));
        System.out.println(f1.abs());
        System.out.println(f1.negate());


    }
}
