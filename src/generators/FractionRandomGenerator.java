package generators;

import entity.Fraction;

import java.util.Random;

public class FractionRandomGenerator implements EntityGenerator<Fraction> {
    private Random random = new Random();

    @Override
    public Fraction generate() {
        int numerator;
        int denominator;

        while (true) {
            numerator = random.nextInt(10);
            if (numerator != 0) {
                break;
            }
        }
        while (true) {
            denominator = random.nextInt(10);
            if (denominator != 0) {
                break;
            }
        }

        return new Fraction(numerator, denominator);
    }
}
