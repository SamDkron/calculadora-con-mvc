package modelo;

public class Division implements Operacion {
    @Override
    public double calcular(double a, double b) {
        if(b == 0){
            throw new ArithmeticException("operacion invalida");
        }
        return a / b;
    }
}
