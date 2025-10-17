package calculator.model;

import java.util.List;

public class Calculator {
    public static int add(List<String> numbers) {
        int sum = 0;

        for(String number : numbers) {
            if (number.isEmpty()) {
                continue;
            }
            int value = Integer.parseInt(number);
            InputValidator.validatePositive(value);
            sum += value;
        }

        return sum;
    }
}
