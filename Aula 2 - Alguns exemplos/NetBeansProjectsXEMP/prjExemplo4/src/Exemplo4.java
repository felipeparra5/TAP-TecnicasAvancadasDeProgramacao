
/**
 
 * @author Lucas Monaco
 */
public class Exemplo4 {
    public static void main(String[] args) {
        double numero, resultado;
        int cont;
        
        numero = Math.random() * 100;
        
        for(cont=1; cont <=10; cont++ ){
            resultado = numero * cont;
            System.out.println(numero + " X " + cont + " = " + resultado);
        }
    }
    
}
