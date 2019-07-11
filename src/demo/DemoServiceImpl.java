package demo;

import entity.Fraction;
import generators.EntityGenerator;
import generators.FractionRandomGenerator;
import services.FractionService;
import services.FractionServiceImpl;

public class DemoServiceImpl implements DemoService {
    private EntityGenerator<Fraction> fractionGenerator;
    private FractionService fractionService;
    private Fraction fraction1;
    private Fraction fraction2;

    public DemoServiceImpl() {
        fractionGenerator = new FractionRandomGenerator();
        fractionService = new FractionServiceImpl();
        fraction1 = fractionGenerator.generate();
        fraction2 = fractionGenerator.generate();
    }

    @Override
    public void start() {
        System.out.println("------ Demo \"fractions\" start ------");
        System.out.println("Generated fractions: " + fraction1 + " and " + fraction2);
        System.out.println();

        simplifyFractions();
        sumFractions();
        differenceFractions();
        multiplyFractions();
        divideFractions();

        System.out.println("------ Demo \"fractions\" end ------");
    }

    private void simplifyFractions() {
        System.out.println("------ Simplifying fractions ------");
        Fraction simplifiedFraction1 = fractionService.simplifying(fraction1);
        Fraction simplifiedFraction2 = fractionService.simplifying(fraction2);
        System.out.println("After simplifying "
                + (simplifiedFraction1 != null ? simplifiedFraction1 : "Something wrong happened during simplifying" + fraction1)
                + " and " + (simplifiedFraction2 != null ? simplifiedFraction2 : "Something wrong happened during simplifying" + fraction2));
        System.out.println();
    }

    private void sumFractions() {
        System.out.println("------ Sum fractions ------");
        Fraction fractionResult = fractionService.sum(fraction1, fraction2);
        System.out.println(fraction1 + " + " + fraction2 + " = "
                + (fractionResult != null ? fractionResult : "Can't be calculated"));
        System.out.println();
    }

    private void differenceFractions() {
        System.out.println("------ Difference fractions ------");
        Fraction fractionResult = fractionService.difference(fraction1, fraction2);
        System.out.println(fraction1 + " - " + fraction2 + " = "
                + (fractionResult != null ? fractionResult : "Can't be calculated"));
        System.out.println();
    }

    private void multiplyFractions() {
        System.out.println("------ Multiplication fractions ------");
        Fraction fractionResult = fractionService.multiplication(fraction1, fraction2);
        System.out.println(fraction1 + " * " + fraction2 + " = "
                + (fractionResult != null ? fractionResult : "Can't be calculated"));
        System.out.println();
    }

    private void divideFractions() {
        System.out.println("------ Dividing fractions ------");
        Fraction fractionResult = fractionService.dividing(fraction1, fraction2);
        System.out.println(fraction1 + " / " + fraction2 + " = "
                + (fractionResult != null ? fractionResult : "Can't be calculated"));
        System.out.println();
    }

}
