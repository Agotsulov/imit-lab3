import java.util.Random;

public class DefiniteIntegral implements Functional {

    double left;
    double right;

    double n;

    public DefiniteIntegral(double a, double b, int n) {
        this.left = a;
        this.right = b;
        this.n = n;
    }

    public double eval(Function function) throws FunctionalException {
        if ((left < function.getA()) || (right > function.getB())) throw new FunctionalException();

        double result = 0;
        double h = (right - left) / n;

        for(int i = 0; i < n; i++)
            result += function.f(left + h*(i + 0.5));

        result *= h;
        return result;
    }
}