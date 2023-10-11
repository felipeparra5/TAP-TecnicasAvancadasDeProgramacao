/**
 *
 * @author parra
 */
public class Circulo {
    private double raio;
    private String uniMed;
    
    public Circulo(String uMed){
        uniMed = uMed;
    }
    
    public void setRaio(double r){
        raio = r;
    }   
    
    public double getRaio(){
        return(raio);
    }  
    
    public String getUnimed(){
        return(uniMed);
    }
    
    public double calcArea(){
        return (3.1416 * raio * raio);
    }    
    
    public double calcPerimetro(){
        return (2 * 3.1416 * raio);
    }
    
    public double calcDiametro(){
        return(2 * raio);
    }
}  
