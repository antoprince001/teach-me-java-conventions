package powerpackage;

public class PowerFinder {

    public static int OF(int base, int exponent) {
        int product = 1;
        for (int i = 0; i<exponent; i++) {
            product *= base;
        }
        return product;
    }

}
