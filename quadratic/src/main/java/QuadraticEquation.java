public class QuadraticEquation {
    double a,b,c;

    public QuadraticEquation(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double[] solve(){
        double[] result = new double[2];
        double D = b*b - 4 * a * c;
        result[0] = (-b + Math.sqrt(b*b - 4 * a * c)) / (2 * a);
        result[1] = (-b - Math.sqrt(b*b - 4 * a * c)) / (2 * a);
        return result;
    }

    @Override
    public String toString() {
        return "QuadraticEquation{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

}
