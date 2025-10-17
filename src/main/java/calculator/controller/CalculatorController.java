package calculator.controller;

import calculator.model.Calculator;
import calculator.model.Splitter;
import calculator.view.InputView;
import calculator.view.OutputView;
import java.util.List;

public class CalculatorController {
    private final OutputView outputview;
    private final InputView inputview;

    public CalculatorController(OutputView outputview, InputView inputview) {
        this.inputview = inputview;
        this.outputview = outputview;
    }

    public void run() {
        String input = inputview.readExpression();
        List<String> numbers = Splitter.split(input);
        int result = Calculator.add(numbers);
        outputview.printResult(result);
    }
}
