import java.util.Scanner;
 
/**
*
* @author parra
*/

public class Aplic {
    public static void main(String[] args) {
        int opcao;
        double medAlt, medBase;
        String tipoMedida;
        
        //instanciar um objeto da classe Scanner

        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a unidade de medida: ");
        tipoMedida = entrada.next();

        //instanciar um objeto da classe Retangulo

        Retangulo objRet = new Retangulo(tipoMedida);
        
        System.out.print("Digite a medida da altura: ");
        medAlt = entrada.nextDouble();
        objRet.setAltura(medAlt);//passagem de mensagem
        
        System.out.print("Digite a medida da base: ");
        medBase = entrada.nextDouble();
        objRet.setBase(medBase);//passagem de mensagem
        
        do{
            System.out.println("\n1-Consultar área do retângulo");
            System.out.println("\n2-Consultar perímetro do retângulo");
            System.out.println("\n3-Sair");
            System.out.println("\n\tDigite a Opção");
            opcao = entrada.nextInt();
            
            if (opcao == 1){
                System.out.println("Medida da área do retângulo: " +
                                    objRet.calcArea() +
                        " " + objRet.getUniMed() + "²");//passagem de mensagem

            }else{
                if (opcao == 2){
                    System.out.println("Medida do perimetro do retângulo: " +
                                    objRet.calcPerimetro() +
                            " " + objRet.getUniMed());//passagem de mensagem
                }
            }

        }while(opcao < 3);
    }
}