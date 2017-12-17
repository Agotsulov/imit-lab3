public abstract class Function {

    double a;
    double b;

    public Function(double a,double b){
        this.a = a;
        this.b = b;
    }

    public abstract double f(double x);

    public double getA(){
        return a;
    }

    public double getB(){
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }
}
