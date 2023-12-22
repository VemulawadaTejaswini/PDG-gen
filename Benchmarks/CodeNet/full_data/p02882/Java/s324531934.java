import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double x = sc.nextDouble();
        if(x/a >= a*b/2){
            System.out.println(Math.toDegrees(Math.atan((2*a*a*b-2*x)/a/a/a)));    
        }else{
            System.out.println(Math.toDegrees(Math.acos(2*x/a/b/b)));    
        }
        
    }
}