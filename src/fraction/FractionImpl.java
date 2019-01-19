package fraction;


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

    String fraction;



    public FractionImpl(int numerator, int denominator) {
        // TODO
        this.numerator = numerator;
        this.denominator = denominator;

        if(this.denominator == 0){
            throw new ArithmeticException("cannot divide by 0");
        }
        else if(this.denominator < 0) {
            this.denominator *= -1;
            this.numerator *= -1;
        }

        if (this.denominator % this.numerator == 0) {
            this.denominator /= this.numerator;
            this.numerator = 1;
        }

        if(this.numerator == 0){
            this.denominator = 1;
        }

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

        if (fraction.contains("/")) {
            int divisor_sign_index = fraction.indexOf('/');

            String numerator_string = fraction.substring(0, divisor_sign_index);
            String denominator_string = fraction.substring(divisor_sign_index + 1 );

            this.numerator = Integer.parseInt(numerator_string);
            this.denominator = Integer.parseInt(denominator_string);

            if (this.denominator == 0)
            {
                throw new ArithmeticException("Cannot Divide By 0");
            }
        }
        else if(fraction.indexOf("/") < 0) {
            this.denominator = 1;
            this.numerator = Integer.parseInt(fraction);
        }

    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction add(Fraction f) {
        FractionImpl f2 = new FractionImpl(f.toString());
        FractionImpl f3 = new FractionImpl(numerator, denominator);

        f3.numerator = (f2.numerator * this.denominator) + (this.numerator * f2.denominator);
        f3.denominator = f2.denominator * this.denominator;

        return f3;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction subtract(Fraction f) {
        FractionImpl f2 = new FractionImpl(f.toString());
        FractionImpl f3 = new FractionImpl(numerator, denominator);

        f3.numerator = (f2.numerator * this.denominator) - (this.numerator * f2.denominator);
        f3.denominator = f2.denominator * this.denominator;

        return f3;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction multiply(Fraction f) {
        FractionImpl f2 = new FractionImpl(f.toString());
        FractionImpl f3 = new FractionImpl(numerator, denominator);

        f3.numerator = f2.numerator * this.numerator;
        f3.denominator = f2.denominator * this.denominator;

        return f3;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction divide(Fraction f) {
        FractionImpl f2 = new FractionImpl(f.toString());
        FractionImpl f3 = new FractionImpl(numerator, denominator);
        f = new FractionImpl(f.toString());

        f3.numerator = this.numerator * f2.denominator;
        f3.denominator = f2.numerator * this.denominator;

        return f3;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction abs() {
        FractionImpl f = new FractionImpl(this.numerator, this.denominator);

        if (f.numerator < 0){
            f.numerator *= -1;
        }
        else if (f.denominator < 0){
            f.denominator *= -1;
        }

        return f;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction negate() {
        FractionImpl f = new FractionImpl(this.numerator, this.denominator);

        f.numerator *= -1;
        return f;
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
        if (obj instanceof FractionImpl){
            if (((FractionImpl) obj).numerator == this.numerator && ((FractionImpl) obj).denominator == this.denominator){
                return true;
            }
        }

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
        FractionImpl f = new FractionImpl(this.numerator, this.denominator);

        f.denominator = this.numerator;
        f.numerator = this.denominator;
        return f;
    }


    /**
     * @inheritDoc
     */
    @Override
    public int compareTo(Fraction o) {


        return 0;
    }
/*
    public FractionImpl(){
        if(this.denominator == 0){
            throw new ArithmeticException("cannot divide by 0");
        }
        else if(this.denominator < 0) {
            this.denominator *= -1;
            this.numerator *= -1;
        }

        if (this.denominator % this.numerator == 0) {
            this.denominator /= this.numerator;
            this.numerator = 1;
        }

        if(this.numerator == 0){
            this.denominator = 1;
        }
    }
*/
    /**
     * @inheritDoc
     */
    @Override
    public String toString() {
        // the following lines normalises the fractions

        //the following lines converts the code into a string

        if (this.denominator == 0) {
            this.fraction= this.numerator + "";
        }
        else{
            this.fraction = this.numerator + "/" + this.denominator;
        }
        return this.fraction;
    }
}