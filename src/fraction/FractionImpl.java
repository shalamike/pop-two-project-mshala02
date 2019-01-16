package fraction;

import org.omg.PortableInterceptor.INACTIVE;

public class FractionImpl implements Fraction {
    /**
     * Parameters are the <em>numerator</em> and the <em>denominator</em>.
     * Normalize the fraction as you create it.
     * For instance, if the parameters are <pre>(8, -12)</pre>, create a <pre>fraction.Fraction</pre> with numerator
     * <pre>-2</pre> and denominator <pre>3</pre>.
     *
     * The constructor should throw an <pre>ArithmeticException</pre> if the denominator is zero.
     *
     * @param numerator
     * @param denominator
     */
    int numerator, denominator;




    public FractionImpl(int numerator, int denominator) {
        // TODO
        this.numerator = numerator;
        this.denominator = denominator;
        /*
        if(this.denominator == 0){
            throw new ArithmeticException("cannot divide by 0");
        }

        else if(this.denominator < 0) {
            this.denominator *= -1;
            this.numerator *= -1;
        }

        while(this.numerator % this.denominator != 0) {
            this.numerator = this.numerator/this.denominator;
        }


        for(int i = 0; i > 10; i++) {
            if(this.numerator % i == 0 && this.denominator % i == 0) {
                this.numerator = this.numerator / i;
                this.denominator = this.denominator / i;
            }
        }
    */

    }

    /**
     * The parameter is the numerator and <pre>1</pre> is the implicit denominator.
     *
     * @param wholeNumber representing the numerator
     */
    public FractionImpl(int wholeNumber) {
        // TODO
        this.numerator = wholeNumber;
        this.denominator = 1;

    }
    /**
     * The parameter is a <pre>String</pre> containing either a whole number, such as `5` or `-3`, or a fraction,
     * such as "8/-12".
     * Allow blanks around (but not within) integers.
     * The constructor should throw an <pre>ArithmeticException</pre>
     * if given a string representing a fraction whose denominator is zero.
     * <p>
     * You may find it helpful to look at the available String API methods in the Java API.
     *
     * @param fraction the string representation of the fraction
     */
    public FractionImpl(String fraction) {
        // TODO

        int divisor_sign_index = fraction.indexOf('/');

        String numerator_string = fraction.substring(0, divisor_sign_index);
        String denominator_string = fraction.substring(divisor_sign_index, fraction.length() );

        //this.numerator = Integer.parseInt(numerator_string);
        this.numerator = Integer.parseInt(numerator_string);
        this.denominator = Integer.parseInt(denominator_string);


    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction add(Fraction f) {




        return null;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction subtract(Fraction f) {
        return null;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction multiply(Fraction f) {
        return null;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction divide(Fraction f) {
        return null;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction abs() {
        return null;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction negate() {
        return null;
    }

    /**
     * @inheritDoc
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /**
     * @inheritDoc
     */
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /**
     * @inheritDoc
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction inverse() {
        return null;
    }

    /**
     * @inheritDoc
     */
    @Override
    public int compareTo(Fraction o) {
        return 0;
    }

    /**
     * @inheritDoc
     */
    @Override
    public String toString() {
        String fraction = this.numerator + "/" + this.denominator;
        return fraction;
    }
}