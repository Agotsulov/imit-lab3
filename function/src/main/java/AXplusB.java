public class AXplusB extends Function{

    double A;
    double B;

    public AXplusB(double a,double b,double A,double B){
        super(a,b);
        this.A = A;
        this.B = B;
    }

    public double f(double x) {
        return A*x + B;
    }

}
