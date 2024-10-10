import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

import static org.assertj.core.api.Assertions.assertThat;

public class ResistorColorDuoTest {
    private ResistorColorDuo resistorColorDuo;

    @BeforeEach
    public void setup() {
        resistorColorDuo = new ResistorColorDuo();
    }

    @Test
    public void testBrownAndBlack() {
        assertThat(
                resistorColorDuo.value(new String[]{"brown", "black"})
        ).isEqualTo(10);
    }
}
