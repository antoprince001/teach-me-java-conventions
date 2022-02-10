package powerpackage;

import org.junit.jupiter.api.Test;

public class PowerFinderTest {

    @Test
    public void one_raised_to_one_is_one() {
        assert PowerFinder.OF(1,1) == 1;
    }

    @Test
    public void two_raised_to_one_is_two() {
        assert PowerFinder.OF(2,1) == 2;
    }

    @Test
    public void two_raised_to_two_is_four() {
        assert PowerFinder.OF(2, 2) == 4;
    }

    @Test
    public void three_raised_to_two_is_nine() {
        assert PowerFinder.OF(3, 2) == 3*3;
    }
}
