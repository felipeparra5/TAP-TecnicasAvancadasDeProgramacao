
/**
 *
 * @author Lucas Monaco
 */
public class Exemplo6 {

    public static void main(String[] args) {
        
        double[] tabNum = new double[10];
        int col;
        
        for (col = 0; col <10; col++){
            tabNum[col] = Math.random() * 100;
        }
        for (col = 0; col < 10; col ++){
            System.out.println("tabNum[" + col + "] = " + tabNum[col]);
        }
    }
    
}
