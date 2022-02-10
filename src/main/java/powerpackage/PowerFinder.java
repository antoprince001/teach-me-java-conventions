package powerpackage;

public class PowerFinder {

    public static int OF(int base, int exponent) {
        int product = 1;
        for (int itr = 0; itr <exponent; itr++) {
            product *= base;
        }
        return product;
    }

}
