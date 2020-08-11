package Lesson05;

public class Complex {

    double re, im;

    public Complex() {
    }

    public Complex(int re) {
        this.re = re;
    }

    public Complex(int re, int im) {
        this.re = re;
        this.im = im;
    }

    public void add2Complex(Complex c1, Complex c2) {
        this.re = c1.re + c2.re;
        this.im = c1.im + c2.im;
        System.out.println(c1.re + " + " + c1.im + ".i" + " add " + c2.re + " + " + c2.im + ".i" + " = " + this.re + " + " + this.im + ".i");
    }

    public void sub2Complex(Complex c1, Complex c2) {
        this.re = c1.re - c2.re;
        this.im = c1.im - c2.im;
        System.out.println(c1.re + " + " + c1.im + ".i" + " sub " + c2.re + " + " + c2.im + ".i" + " = " + this.re + " + " + this.im + ".i");
    }

    public void multi2Complex(Complex c1, Complex c2) {
        this.re = c1.re * c2.re - c1.im * c2.im;
        this.im = c1.re * c2.im + c1.im * c2.re;
        System.out.println(c1.re + " + " + c1.im + ".i" + " multi " + c2.re + " + " + c2.im + ".i" + " = " + this.re + " + " + this.im + ".i");
    }

    public void division2Complex(Complex c1, Complex c2) {
        this.re = (c1.re * c2.re + c1.im * c2.im) / (c2.re * c2.re + c2.im * c2.im);
        this.im = (c1.im * c2.re - c1.re * c2.im) / (c2.re * c2.re + c2.im * c2.im);
        System.out.println(c1.re + " + " + c1.im + ".i" + " division " + c2.re + " + " + c2.im + ".i" + " = " + this.re + " + " + this.im + ".i");
    }

}
