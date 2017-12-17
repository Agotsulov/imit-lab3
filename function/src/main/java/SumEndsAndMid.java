public class SumEndsAndMid implements Functional {

    public double eval(Function function){
        double s = function.f(function.getA());
        double m = function.f(function.getA() + ((function.getB() - function.getA()) / 2));
        double e = function.f(function.getB());
        return s + m + e;
    }


}
