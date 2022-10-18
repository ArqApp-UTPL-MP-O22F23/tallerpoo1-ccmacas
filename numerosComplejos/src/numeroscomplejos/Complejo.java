package numeroscomplejos;


public class Complejo implements Operaciones {

    // atributos
    private double parteReal;
    private double parteImaginaria;

    // constructor
    public Complejo() {
        this.parteReal = 1.0;
        this.parteImaginaria = 0.0;
    }

    public Complejo(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    // metodos get y set
    public double getParteReal() {
        return parteReal;
    }

    public void setParteReal(double parteReal) {
        this.parteReal = parteReal;
    }

    public double getParteImaginaria() {
        return parteImaginaria;
    }

    public void setParteImaginaria(double parteImaginaria) {
        this.parteImaginaria = parteImaginaria;
    }

    // metodo para sumar numeros complejos
    @Override
    public Complejo calcularSuma(Complejo b) {

        double nuevoReal = this.parteReal + b.getParteReal();
        double nuevoImaginario = this.parteImaginaria + b.getParteImaginaria();

        return new Complejo(nuevoReal, nuevoImaginario);

    }

    // metodo para restar numeros compplejos 
    @Override
    public Complejo calcularResta(Complejo b) {

        double nuevoReal = this.parteReal - b.getParteReal();
        double nuevoImaginario = this.parteImaginaria - b.getParteImaginaria();

        return new Complejo(nuevoReal, nuevoImaginario);

    }

    @Override
    public String toString() {
        return String.format("%.2f + %.2fi", this.parteReal, this.parteImaginaria);
    }
    
    
    

}
