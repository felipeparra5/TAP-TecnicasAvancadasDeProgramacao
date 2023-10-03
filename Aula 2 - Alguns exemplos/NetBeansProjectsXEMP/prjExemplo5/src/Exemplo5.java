

/**
 *
 * @author Lucas Monaco
 */
public class Exemplo5 {

    public static void main(String[] args) {
        double numero, resultado;
        int cont = 0;
        
        numero = Math.random() * 100;
        
        while(cont<=10 ){
            cont = cont + 1;
            resultado = numero * cont;
            System.out.println(numero + " X " + cont + " = " + resultado);
        }
    
    }
    
}
