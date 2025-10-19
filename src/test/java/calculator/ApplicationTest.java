package calculator;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;


import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class ApplicationTest extends NsTest {

    @Test
    void 기본_구문자_덧셈() {
        run("1,2,3");
        assertThat(output()).contains("결과 : 6");
    }

    @Test
    void 숫자가_아닌_입력_예외() {
        assertThatThrownBy(() -> runException("1,a,3"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("숫자만 입력 가능합니다.");
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}
