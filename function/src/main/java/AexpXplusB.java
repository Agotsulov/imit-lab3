public class AexpXplusB extends Function{

    double A;
    double B;

    public AexpXplusB(double a,double b,double A,double B){
        super(a,b);
        this.A = A;
        this.B = B;
    }

    public double f(double x) {
        return A*Math.exp(x) + B;
    }
}

