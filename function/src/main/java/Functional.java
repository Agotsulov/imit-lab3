public interface Functional<F extends Function> {
    public double eval(F function) throws FunctionalException;
}
