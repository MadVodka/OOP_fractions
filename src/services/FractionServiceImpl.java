package services;

import entity.Fraction;

public class FractionServiceImpl implements FractionService {
    @Override
    public Fraction simplifying(Fraction fraction) {
        int numerator = fraction.getNumerator();
        int denominator = fraction.getDenominator();
        int comparing = Integer.compare(numerator, denominator);

        if (comparing == 0) {
            return new Fraction(1, 1);
        } else if (comparing < 0) {
            if (denominator % numerator == 0) {
                int newNumerator = 1;
                int newDenominator = denominator / numerator;
                return new Fraction(newNumerator, newDenominator);
            } else if (denominator % 5 == 0 && numerator % 5 == 0) {
                return simplifying(new Fraction(numerator / 5, denominator / 5));
            } else if (denominator % 3 == 0 && numerator % 3 == 0) {
                return simplifying(new Fraction(numerator / 3, denominator / 3));
            } else if (denominator % 2 == 0 && numerator % 2 == 0) {
                return simplifying(new Fraction(numerator / 2, denominator / 2));
            } else {
                return fraction;
            }
        } else {
            if (numerator % denominator == 0) {
                int newDenominator = 1;
                int newNumerator = numerator / denominator;
                return new Fraction(newNumerator, newDenominator);
            } else if (denominator % 5 == 0 && numerator % 5 == 0) {
                return simplifying(new Fraction(numerator / 5, denominator / 5));
            } else if (denominator % 3 == 0 && numerator % 3 == 0) {
                return simplifying(new Fraction(numerator / 3, denominator / 3));
            } else if (denominator % 2 == 0 && numerator % 2 == 0) {
                return simplifying(new Fraction(numerator / 2, denominator / 2));
            } else {
                return fraction;
            }
        }
    }

    @Override
    public Fraction sum(Fraction fraction1, Fraction fraction2) {
        if (fraction1.equals(fraction2)) {
            Fraction fraction = new Fraction(fraction1.getNumerator() * 2, fraction1.getDenominator());
            return simplifying(fraction);
        } else {
            int newNumerator = fraction1.getNumerator() * fraction2.getDenominator()
                    + fraction2.getNumerator() * fraction1.getDenominator();
            int newDenominator = fraction1.getDenominator() * fraction2.getDenominator();
            return simplifying(new Fraction(newNumerator, newDenominator));
        }

    }

    @Override
    public Fraction difference(Fraction fraction1, Fraction fraction2) {
        if (fraction1.equals(fraction2)) {
            return new Fraction(0, fraction1.getDenominator());
        } else {
            int newNumerator = fraction1.getNumerator() * fraction2.getDenominator()
                    - fraction2.getNumerator() * fraction1.getDenominator();
            int newDenominator = fraction1.getDenominator() * fraction2.getDenominator();
            return simplifying(new Fraction(newNumerator, newDenominator));
        }
    }

    @Override
    public Fraction multiplication(Fraction fraction1, Fraction fraction2) {
        int newNumerator = fraction1.getNumerator() * fraction2.getNumerator();
        int newDenominator = fraction1.getDenominator() * fraction2.getDenominator();
        return simplifying(new Fraction(newNumerator, newDenominator));
    }

    @Override
    public Fraction dividing(Fraction fraction1, Fraction fraction2) {
        if (fraction1.equals(fraction2)) {
            Fraction fraction = new Fraction(1, 1);
            return simplifying(fraction);
        } else {
            int newNumerator = fraction1.getNumerator() * fraction2.getDenominator();
            int newDenominator = fraction1.getDenominator() * fraction2.getNumerator();
            return simplifying(new Fraction(newNumerator, newDenominator));
        }
    }
}
