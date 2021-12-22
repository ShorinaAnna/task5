package com.shorina;

public class Calc {
    public int pow(int base, int degree) {
        return (int) Math.pow(base,degree);
    }

    public double sqrt(double base) {
        return (double) Math.sqrt(base);
    }

    public double exp(double degree) {
        return (double) Math.exp(degree);
    }

    public int nrt(int base, int degree) {
        double n = 1.0/degree;
        return (int) Math.round(Math.pow(base, n));
    }

    public double sqr(double base) {
        return (double) Math.pow(base,2);
    }

    public static int getFactorial(int base) {
        int result = 1;
        for (int i = 1; i <= base; i++) {
            result = result * i;
        }
        return result;
    }

    public String square_root(double a, double b, double c) {
        double D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            return ("roots: x1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) {
            double x;
            x = -b / (2 * a);
            return ("one root: x = " + x);
        }
        else {
            return ("no roots");
        }
    }
}
