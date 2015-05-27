package pro.tremblay.diamond;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Henri Tremblay
 */
public class DiamondTest {

    Diamond diamond = new Diamond();

    @Test
    public void print_a() {
        assertThat(diamond.print('a')).isEqualTo("a");
    }

    @Test
    public void print_b() {
        assertThat(diamond.print('b')).isEqualTo(" a\nb b\n a");
    }

    @Test
    public void print_c() {
        assertThat(diamond.print('c')).isEqualTo("  a\n b b\nc   c\n b b\n  a");
    }

    @Test
    public void repeatLetter() {
        assertThat(diamond.spaces(0)).isEqualTo("");
        assertThat(diamond.spaces(2)).isEqualTo("  ");
    }
}