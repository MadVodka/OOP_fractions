package entity;

import java.util.Objects;

public class Fraction {
    private int numerator;
    private int denominator;

    public int getNumerator() {
        return numerator;
    }

    public Fraction() {
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction setNumerator(int numerator) {
        this.numerator = numerator;
        return this;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction setDenominator(int denominator) {
        this.denominator = denominator;
        return this;
    }

    @Override
    public String toString() {
        if (numerator == 0) {
            return "0";
        }
        return numerator + "/" + denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return numerator == fraction.numerator &&
                denominator == fraction.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }
}
