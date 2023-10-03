
import java.util.Scanner;

/**
 *
 * @author parra e bruno
 */
public class Aplic {
    public static void main(String[] args) {
        int opcao;
        
        //instanciação de um objeto da classe Scanner
        Scanner entrada = new Scanner(System.in);
        
       //Instanciação de um objeto da classe Buzina
       Buzina objBuzina = new Buzina();
       
       do{
           System.out.println("\n1-Ligar a Buzina");
           System.out.println("2-Desligar a Buzina");
           System.out.println("3-Acionar a Buzina");
           System.out.println("4-Sair");
           System.out.println("Digite a opção");
           opcao = entrada.nextInt ();
           
           if(opcao == 1){
               if (objBuzina.ObterEstado() == false){
                   objBuzina.ligar();
                   System.out.println("\n A buzina foi ligada\n");
               }else {
                   System.out.println("---> A buzina já esta ligada");
               }
           }
       }while (opcao < 4);
    }
    
}
