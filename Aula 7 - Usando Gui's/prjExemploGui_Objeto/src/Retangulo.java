/**
 *
 * @author parra
 */
public class Retangulo {
    private double altura;
    private double base;
    private String uniMed;
                                        
    public Retangulo(String uMed){
        uniMed = uMed;
    }
                                
    public void setAltura(double a){
        altura = a;
    }

    public void setBase(double b){
        base = b;
    }    
    
    public String getUniMed(){
        return(uniMed);
    }
    
    public double getAltura(){
        return(altura);
    }
    
    public double getBase(){
        return(base);
    }
    
    public double calcArea(){
        double area;
        area = altura * base;
        return(area);
    }
    
    public double calcPerimetro(){
        double perimetro;
        perimetro = 2*(altura + base);
        return(perimetro);
    }
}
