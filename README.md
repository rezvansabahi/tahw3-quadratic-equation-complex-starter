# TA HW3 - Quadratic Equation (Complex) - 70 Points

<div dir="rtl" align="right">
  
کلاس زیر مدل سازی اعداد مختلط است. دو متد که در آنها کامنت TODO وجود دارد را ابتدا تکمیل کنید. یعنی دو متد times و plus.

پس از کامل کردن بدنه این دو متد سعی کنید در کلاسی جداگانه اقدام به استفاده از این کلاس و کار با آن کنید و ساختار آن را بررسی کنید.


</div>



```java
package ir.ac.kntu;

//use ctrl+alt+i and ctrl+alt+l to clean this code!
public class Complex {
private double re;   // the real part
 private double im;   // the imaginary part

    // create a new object with the given real and imaginary parts
    public Complex(double real, double imag) { re = real; im = imag;
    }

    // return a string representation of the invoking Complex object
    public String toString() {
        if (im == 0) return re + "";
if (re == 0) return im + "i";
        if (im <  0) return re + " - " + (-im) + "i";
return re + " + " + im + "i";
    }

    // return abs/modulus/magnitude
    public double abs() {
return Math.hypot(re, im);
    }

    // return angle/phase/argument, normalized to be between -pi and pi
    public double phase() {
        return Math.atan2(im, re);
    }

    // return a new Complex object whose value is (this + b)
public Complex plus(Complex b) {
        //TODO: Complete this method
    }

// return a new Complex object whose value is (this - b)
    public Complex minus(Complex b) {
        Complex a = this;
double real = a.re - b.re;
        double imag = a.im - b.im;
        return new Complex(real, imag);
    }

    // return a new Complex object whose value is (this * b)
    public Complex times(Complex b) {
        //TODO: Complete this method
    }

    // return a new object whose value is (this * alpha)
    public Complex scale(double alpha) {
        return new Complex(alpha * re, alpha * im);
    }

    // return a new Complex object 
    //whose value is the conjugate of this
    public Complex conjugate() {
        return new Complex(re, -im);
    }

    // return a new Complex object 
    //whose value is the reciprocal of this
    public Complex reciprocal() {
        double scale = re*re + im*im;
        return new Complex(re / scale, -im / scale);
    }

    // return the real or imaginary part
    public double getRealPart() { return re; }
    public double getImaginaryPart() { return im; }

    // return a / b
    public Complex divides(Complex b) {
        Complex a = this;
        return a.times(b.reciprocal());
    }

    // return a new Complex object 
    //whose value is the complex exponential of this
    public Complex exp() {
        return new Complex(Math.exp(re) * Math.cos(im), Math.exp(re) * Math.sin(im));
    }

    // return a new Complex object 
    //whose value is the complex sine of this
    public Complex sin() {
        return new Complex(Math.sin(re) * Math.cosh(im), Math.cos(re) * Math.sinh(im));
    }

    // return a new Complex object 
    //whose value is the complex cosine of this
    public Complex cos() {
        return new Complex(Math.cos(re) * Math.cosh(im), -Math.sin(re) * Math.sinh(im));
    }

    // return a new Complex object whose value is the complex tangent of this
    public Complex tan() {
        return sin().divides(cos());
    }

    // a static version of plus
    public static Complex plus(Complex a, Complex b) {
        double real = a.re + b.re;
        double imag = a.im + b.im;
        Complex sum = new Complex(real, imag);
        return sum;
    }

}
```

<div dir="rtl" align="right">

حال می خواهیم با استفاده از قابلیت ترکیب یا همان Composition کلاس معادله درجه 2 ای را که قبلا نوشته بودیم را به گونه ای تغییر دهیم که توانایی محاسبات مختلط را داشته باشد.

پس از کامل کردن کلاس Complex اینبار معادله درجه 2 را طوری مدل سازی کنید که اگر دلتای معادله منفی باشد بتواند دو عدد مختلط تولید کند. در صورتی که دلتا هم منفی نباشد باید عددی مختلط برگردد با این تفاوت که عدد مختلط برگردانده شده مقدار موهومی ندارد.

در کلاسی جداگانه قابلیت های کلاس جدید را بررسی کنید
  
</div>

<div dir="rtl" align="right">
دقت داشته باشید که همچنان سازنده کلاس معادله درجه 2 سه عدد از جنس double دریافت می کند.  
  
  دقت کنید که فقط یک سازنده تعریف کنید
  
  دقت کنید که در صورت عدم رعایت موارد کد تمییز تکلیف شما تا زمانی که این اشکالات را رفع نکنید قبول نمی شود.
</div>

```java

package ir.ac.kntu;

public class QuadraticEquation{
    //your logic, fields and constructor is here
    //a,b,c data type is double
    //public Complex getRoot1() // 1 is a complex number with imaginary part zero.
    //public Complex getRoot2()
    //public double getDisc...();
}
```
