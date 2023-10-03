

/**
 *
 * @author parra e bruno
 */
public class Buzina {
    private boolean estado; //(false - desligado, true - ligada)
    
    //metodo construtor
    //tem o mesmo nome da classe
    //fornece um estado incial 
    //para o objeto
    
    public Buzina(){
        estado = false; //estado de desligado
    }
    
    public void ligar (){
        estado = true; //estado de ligar
    }
    
    public void desligar(){
        estado = false;//estado de desligar
    }
    
    public void acionar (){
        if (estado == true){
        System.out.println("\n\tFonFon...FonFon...FonFon...FonFon...Fon Fon\n");
        }
    }
    
    public boolean ObterEstado(){
        return(estado);
    }
} 
