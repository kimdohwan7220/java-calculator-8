package calculator.view;

import calculator.constants.Messages;

public class OutputView {
    public void printResult(int result) {
        System.out.println(Messages.RESULT_PREFIX + result);
    }
}
