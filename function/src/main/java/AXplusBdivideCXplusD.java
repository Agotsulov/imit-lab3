public class AXplusBdivideCXplusD extends Function{

    double A;
    double B;
    double C;
    double D;

    public AXplusBdivideCXplusD(double a,double b,double A,double B,double C,double D){
        super(a,b);
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }

    public double f(double x) {
        return (A*x + B)/(C*x + D);
    }

}

