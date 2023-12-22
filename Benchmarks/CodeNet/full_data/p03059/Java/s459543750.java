import java.util.*;
 
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double t=sc.nextDouble()+0.5;
        System.out.println((int)((int)(t/a)*b));
    }
}