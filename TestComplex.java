
package Lesson05;

public class TestComplex {
    public static void main(String[] args) {
        Complex complex = new Complex();
        
        Complex c1 = new Complex();
        Complex c2 = new Complex(1);
        Complex c3 = new Complex(3,3);
        Complex c4 = new Complex(4,4);
        
        complex.add2Complex(c3, c4);
        complex.sub2Complex(c3, c4);
        complex.multi2Complex(c3, c4);
        complex.division2Complex(c3, c4);
        
    }
}
