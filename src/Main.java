import fraction.Fraction;
import fraction.FractionImpl;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        FractionImpl f1 = new FractionImpl("-3/7");
        FractionImpl f2 = new FractionImpl("2/4");
        FractionImpl f3 = new FractionImpl("6/-14");

        System.out.println("Fraction 1:");
        System.out.println(f1);
        System.out.println("Fraction 2:");
        System.out.println(f2);
        System.out.println("Fraction 3:");
        System.out.println(f3);
        System.out.println();
        System.out.println("Fraction 1 + Fraction 2:");
        System.out.println(f1.add(f2));
        System.out.println("Fraction 1 - Fraction 2:");
        System.out.println(f1.subtract(f2));
        System.out.println("Fraction 1 * Fraction 2:");
        System.out.println(f1.multiply(f2));
        System.out.println("Fraction 1 / Fraction2:");
        System.out.println(f1.divide(f2));
        System.out.println("Fraction 1 Ablsolute:");
        System.out.println(f1.abs());
        System.out.println("Fraction 1 negative:");
        System.out.println(f1.negate());
        System.out.println("Fraction 2 negative:");
        System.out.println(f2.negate());
        System.out.println("the inverse of Fraction 1:");
        System.out.println(f1.inverse());
        System.out.println("is Fraction 1 equal to Fraction 2:");
        System.out.println(f1.equals(f2));
        System.out.println("is Fraction 1 equal to Fraction 3:");
        System.out.println(f1.equals(f3));
        System.out.println("comparing Fraction 1 to Fraction 2:");
        System.out.println(f1.compareTo(f2));
        System.out.println("Comparing Fraction 1 to Fraction 3");
        System.out.println(f1.compareTo(f3));
        System.out.println("Comparing Fraction 2 to Fraction 1");
        System.out.println(f2.compareTo(f1));





    }
}
