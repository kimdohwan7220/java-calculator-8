package calculator.model;

import calculator.constants.Messages;

public class InputValidator {
    public static void validatePositive (int num) {
        if (num < 0) {
            throw new IllegalArgumentException(Messages.NEGATIVE_NUMBER_ERROR);
        }
    }

    public static void validateNumeric (String input) {
        if (!input.matches("\\d+")) {
            throw new IllegalArgumentException(Messages.INVALID_NUMBER_ERROR);
        }
    }
}
