package calculator.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class CalculatorTest {

    @Test
    void 숫자_리스트_합_계산() {
        List<String> list = List.of("1", "2", "3");
        int result = Calculator.add(list);
        assertEquals(6,result);
    }

    @Test
    void 빈_문자열이_존재하면_무시하고_합을_계산() {
        List<String> list = List.of("1", "", "2");
        int result = Calculator.add(list);
        assertEquals(3, result);
    }

    @Test
    void 음수_존재하면_예외발생() {
        List<String> list = List.of("1", "-2", "3");
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> {
            Calculator.add(list);
        });
        assertEquals("음수는 입력이 불가능합니다.", e.getMessage());
    }

}
