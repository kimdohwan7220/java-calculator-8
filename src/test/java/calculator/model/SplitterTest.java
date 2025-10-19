package calculator.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

class SplitterTest {
    @Test
    void 빈_문자열이면_0을_리턴() {
        List<String> result = Splitter.split("");
        assertEquals(List.of("0"), result);
    }

    @Test
    void 기본_구문자_사용() {
        List<String> result = Splitter.split("1,2:3");
        assertEquals(List.of("1", "2", "3"), result);
    }

    @Test
    void 커스텀_구문자_사용() {
        List<String> result = Splitter.split("//;\n1;2;3");
        assertEquals(List.of("1", "2", "3"), result);
    }

    @Test
    void 숫자가_아닌_값_예외발생() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> {
            Splitter.split("1,a:3");
        });
        assertEquals("숫자만 입력 가능합니다.", e.getMessage());
    }
}
