
package boletin2_9;

/**
 *
 * @author David
 */
import java.util.Scanner;
public class Boletin2_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int bi100=100, b100, bi20=20, b20, bi5=5, b5, bi1=1, b1, euros;
        Scanner sc=new Scanner (System.in);
        System.out.println("Cantidad euros: ");
        euros=sc.nextInt();
        b100=(euros/bi100);
        b20=(euros%bi100)/bi20;
        b5=(euros%bi20)/bi5;
        b1=(euros%bi5)/bi1;
        //System.out.println((euros/bi100)+"\n"+((euros%bi100)/bi20)+"\n"+((euros%bi100)/bi5)+"\n"+((euros%bi100)/bi1));
        System.out.println((b100)+"\n"+(b20)+"\n"+(b5)+"\n"+(b1));
    }
    
}
