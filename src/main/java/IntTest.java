
public class IntTest {

    public static int example(int a, int b) {
        if (a < 0) {
            if (b < 0) {
                return a * -500 + 7 * b;
            } else {
                return 5 * a - 16 * b;
            }
        } else {
            if (b < 0) {
                return (a + b) * 53;
            } else {
                return 128 * b - a;
            }
        }
    }

    public static void test_exception(int val) {
        if (val < 0) {
            throw new IllegalArgumentException();
        } else {
            throw new IllegalArgumentException("The other one");
        }
    }

    public int doSomething(int a) {
        return 5 * a;
    }
    
    public boolean method(int a){
        return a < 39;
    }

    public static boolean testBoolean(int i) {
        return i >= 17;
    }

    public static double pow(double base, int exponent) {
        assert exponent >= 0;

        double result = 1;
        double factor = base;

        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result = result * factor;
            }
            factor = factor * factor;
            exponent = exponent >> 1;
        }

        return result;
    }

    public static double abs(double val) {
        if (val < 0) {
            return -1 * val;
        } else {
            return Math.PI;
        }
    }

    public static int anotherMethod(boolean valid) {
        if (valid) {
            return 0;
        } else {
            return -1;
        }
    }

    public static float someFloatFunction(float f) {
        if (f < 0) {
            return f;
        } else {
            return f / 2;
        }
    }

    public static void main(String[] args) {
        example(2, -3);
        testBoolean(5);
        anotherMethod(true);
        abs(-4.3);
        someFloatFunction(3.3f);
       
        new IntTest().method(4);
        new IntTest().doSomething(3);
    }
}
