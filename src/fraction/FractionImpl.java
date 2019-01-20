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

        /*
        if (this.denominator == 0)
        {
            this.fraction= this.numerator + "";
        }
        else if (this.denominator < 0)
        {
            this.numerator *= -1;
            this.denominator *= -1;
        }
        else if (this.denominator % this.numerator == 0)
        {
            this.denominator /= this.numerator;
            this.numerator = 1;
        }
        else
        {
            for (int i  = 10; i > 0; i--)
            {
                if(this.numerator % i == 0 && this.denominator % i == 0)
                {
                    this.numerator /= i;
                    this.denominator /= i;
                }
            }
        }
        */

    }

    /**
     * The parameter is the numerator and <pre>1</pre> is the implicit denominator.
     *
     * @param wholeNumber representing the numerator
     */
    public FractionImpl(int wholeNumber)
    {
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

    /* this method converts the string fraction into two seperate ints, this.numerator and this.denominator
       this method splits the string into two substreings seperated by the '/', regardless of the size of the string.
     */
    public FractionImpl(String fraction) {
        // TODO
        if (fraction.contains("/"))
        {
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
        else if(fraction.indexOf("/") < 0)
        {
            this.denominator = 1;
            this.numerator = Integer.parseInt(fraction);
        }

    }

    /**
     * @inheritDoc
     */

    /*
    this method adds the two fractions the user wants and creates a new value from the result
    */
    @Override
    public Fraction add(Fraction f)
    {
        FractionImpl f2 = new FractionImpl(f.toString());
        FractionImpl f3 = new FractionImpl(numerator, denominator);

        f3.numerator = (f2.numerator * this.denominator) + (this.numerator * f2.denominator);
        f3.denominator = f2.denominator * this.denominator;

        return f3;
    }

    /**
     * @inheritDoc
     */

    /*
    this method subtracts the two fractions the user wants and creates a new value from the result
    */
    @Override
    public Fraction subtract(Fraction f)
    {
        FractionImpl f2 = new FractionImpl(f.toString());
        FractionImpl f3 = new FractionImpl(numerator, denominator);

        f3.numerator = (f2.numerator * this.denominator) - (this.numerator * f2.denominator);
        f3.denominator = f2.denominator * this.denominator;

        return f3;
    }

    /**
     * @inheritDoc
     */
    /*
    this method multiplies the two fractions together and creates a new fraction from the result
    */
    @Override
    public Fraction multiply(Fraction f)
    {
        FractionImpl f2 = new FractionImpl(f.toString());
        FractionImpl f3 = new FractionImpl(numerator, denominator);

        f3.numerator = f2.numerator * this.numerator;
        f3.denominator = f2.denominator * this.denominator;

        return f3;
    }

    /**
     * @inheritDoc
     */
    /*
    this method divides the two fractions together and creates a new fraction from the result
    */
    @Override
    public Fraction divide(Fraction f)
    {
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

    /*
    this method finds the absolute value of the fraction by checking which value in the fraction is a negative and
    returning it to a positive
    */
    @Override
    public Fraction abs()
    {
        FractionImpl f = new FractionImpl(this.numerator, this.denominator);

        if (f.numerator < 0)
        {
            f.numerator *= -1;
        }
        else if (f.denominator < 0)
        {
            f.denominator *= -1;
        }

        return f;
    }

    /**
     * @inheritDoc
     */

    /*
    this method finds the negative value of the fraction.
    */
    @Override
    public Fraction negate()
    {
        FractionImpl f = new FractionImpl(this.numerator, this.denominator);

        /*
        the denominator is multiplied by -1 rather than the numerator
        this is because the method to normalise the fraction would always return the negative to the numerator.
        */
        f.denominator *= -1;
        return f;
    }

    /**
     * @inheritDoc
     */
    @Override
    public int hashCode()
    {
        return super.hashCode();
    }

    /**
     * @inheritDoc
     */

    /*
    this method
    */
    @Override
    public Fraction inverse()
    {
        FractionImpl f = new FractionImpl(this.numerator, this.denominator);

        f.denominator = this.numerator;
        f.numerator = this.denominator;
        return f;
    }

    /**
     * @inheritDoc
     */
    /*
    this method checks if the value of both fractions are equal by checking the difference of the fraction is 0
    */
    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof FractionImpl)
        {
            if (((FractionImpl) obj).numerator * this.denominator == this.numerator * ((FractionImpl) obj).denominator)
            {
                return true;
            }
        }

        return false;
    }

    /**
     * @inheritDoc
     */
    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }


    /**
     * @inheritDoc
     */

    /*
    similar to how we do addition and subtraction of fractions, the compare to method checks the difference between the
    numerator values of the two fractions after getting them equal to the lowest common denominator.
    therefore, the returned value will allways be a positive or a negative int.
    */

    @Override
    public int compareTo(Fraction o)
    {
        FractionImpl f = new FractionImpl(o.toString());
        int comparison = (f.numerator * this.denominator) - (this.numerator * f.denominator);

        return comparison;
    }
    /**
     * @inheritDoc
     */
    @Override
    public String toString()
    {

        /*the following normalises the fraction and converts the code into a string
        although a relatively inefficient, the constructor would not normalise the fraction as it was being created.
        therefore, the fraction is being normalised just before it gets converted to a string to ensure that the
        */

        // this part of the method normalises the fraction before its put into a string
        if (this.denominator == 0)
        {
            this.fraction= this.numerator + "";
        }
        else if (this.denominator < 0)
        {
            this.numerator *= -1;
            this.denominator *= -1;
        }
        else if (this.denominator % this.numerator == 0)
        {
            this.denominator /= this.numerator;
            this.numerator = 1;
        }
        else
        {
            for (int i  = 10; i > 0; i--)
            {
                if(this.numerator % i == 0 && this.denominator % i == 0)
                {
                    this.numerator /= i;
                    this.denominator /= i;
                }
            }
        }
        //this part of the method puts the fraciton into a string
        this.fraction = this.numerator + "/" + this.denominator;

        return this.fraction;
    }
}