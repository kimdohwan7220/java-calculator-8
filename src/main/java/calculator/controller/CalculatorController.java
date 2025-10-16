package calculator.controller;

import calculator.view.InputView;
import calculator.view.OutputView;

public class CalculatorController {
    private final OutputView outputview;
    private final InputView inputview;

    public CalculatorController(OutputView outputview, InputView inputview) {
        this.inputview = inputview;
        this.outputview = outputview;
    }

    public void run() {
        String input = inputview.readExpression();
        outputview.printResult();
    }
}
