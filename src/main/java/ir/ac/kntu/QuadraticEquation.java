package ir.ac.kntu;

public class QuadraticEquation {

    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }

    public double getC() {
        return c;
    }

    public double getB() {
        return b;
    }

    public double getA() {
        return a;
    }

    public double getDiscriminant() {
        return (b * b) - (4 * a * c);
    }

    public Complex getRoot1() {
        double real, imag;
        if (getDiscriminant() < 0) {
            real = (-b) / (2 * a);
            imag = Math.sqrt(-getDiscriminant()) / (2 * a);
        } else {
            real = ((-b) + Math.sqrt(getDiscriminant())) / (2 * a);
            imag = 0;
        }
        Complex temp = new Complex(real, imag);
        return temp;
    }

    public Complex getRoot2() {
        double real, imag;
        if (getDiscriminant() < 0) {
            real = (-b) / (2 * a);
            imag = -Math.sqrt(-getDiscriminant()) / (2 * a);
        } else {
            real = ((-b) - Math.sqrt(getDiscriminant())) / (2 * a);
            imag = 0;
        }
        Complex temp = new Complex(real, imag);
        return temp;
    }
}
