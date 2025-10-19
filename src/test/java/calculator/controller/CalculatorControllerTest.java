package calculator;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class CalculatorControllerTest extends NsTest {

    @Test
    void 기본_구문자_덧셈() {
        run("1,2:3");
        assertThat(output()).contains("결과 : 6");
    }

    @Test
    void 커스텀_구분자_덧셈() {
        assertSimpleTest(() -> {
            run("//;\\n1;2;3");
            assertThat(output()).contains("결과 : 6");
        });
    }

    @Test
    void 커스텀_구문자_한글자만_입력() {
        run("//;\\n7");
        assertThat(output()).contains("결과 : 7");
    }

    @Test
    void 기본_구문자_음수_입력_예외() {
        assertThatThrownBy(() -> runException("1,-2,3"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("음수는 입력이 불가능합니다.");
    }

    @Test
    void 커스텀_구문자_음수_입력_예외() {
        assertThatThrownBy(() -> runException("//;\\n1;-2;3"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("음수는 입력이 불가능합니다.");
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}