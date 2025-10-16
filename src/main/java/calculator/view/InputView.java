package calculator.view;

import calculator.constants.Messages;
import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public String readExpression() {
        System.out.println(Messages.INPUT_PROMPT);
        return Console.readLine();
    }
}

