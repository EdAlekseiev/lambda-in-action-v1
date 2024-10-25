package app;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        MathOperation add = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        System.out.println("Sum of 3 and 2: " + add.operate(3, 2));

        StringManipulator toUpper = s -> s.toUpperCase();
        System.out.println("String test in upper case: " + toUpper.action("test"));

        Function<String, Integer> countUppercase = StringListProcessor::countUppercase;
        System.out.println("Count upper case in Hello World: " + countUppercase.apply("Hello World"));

        Supplier<Integer> randomSupplier = () -> RandomNumberGenerator.generateRandomNumber(1, 100);
        System.out.println("Random number from 1 to 100: " + randomSupplier.get());
    }
}
