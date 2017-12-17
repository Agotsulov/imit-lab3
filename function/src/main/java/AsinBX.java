public class AsinBX extends Function{

    double A;
    double B;

    public AsinBX(double a,double b,double A,double B){
        super(a,b);
        this.A = A;
        this.B = B;
    }

    public double f(double x) {
        return A*Math.sin(B*x);
    }
}

