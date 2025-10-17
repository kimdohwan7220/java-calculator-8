package calculator.model;

import calculator.constants.Symbol;
import calculator.constants.Messages;
import java.util.Arrays;
import java.util.List;

public class Splitter {
    public static List<String> split(String input) {
        InputValidator.validateNotEmpty(input);

        String [] parts;
        if(input.startsWith(Symbol.CUSTOM_DELIMITER_PREFIX)) {
            String[] splitParts = input.split(Symbol.CUSTOM_DELIMITER_SUFFIX, 2);
            String customDelimiter = splitParts[0].substring(Symbol.CUSTOM_DELIMITER_PREFIX.length());
            parts = splitParts[1].split(customDelimiter);
        } else {
            parts = input.split(Symbol.DEFAULT_DELIMITERS);
        }

        for (String part : parts) {
            InputValidator.validateNumeric(part);
        }

        return Arrays.asList(parts);
    }
}
