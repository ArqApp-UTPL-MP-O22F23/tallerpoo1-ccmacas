package numeroscomplejos;

public class NumerosComplejos {

    public static void main(String[] args) {
        
        Complejo c1 = new Complejo(4,6);
        Complejo c2 = new Complejo(2,3);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println("\n** Resultado Suma **");
        System.out.println (c1.calcularSuma(c2));
        System.out.println("\n** Resultado Resta **");
        System.out.println(c1.calcularResta(c2));
        
  
    }

}
