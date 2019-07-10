package services;

import entity.Fraction;

public interface FractionService {
    Fraction simplifying(Fraction fraction);

    Fraction sum(Fraction fraction1, Fraction fraction2);

    Fraction difference(Fraction fraction1, Fraction fraction2);

    Fraction multiplication(Fraction fraction1, Fraction fraction2);

    Fraction dividing(Fraction fraction1, Fraction fraction2);
}
