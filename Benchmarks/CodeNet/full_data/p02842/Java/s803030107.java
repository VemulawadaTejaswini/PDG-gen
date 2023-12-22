import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double x=(double)n/(1.08);
        
if((int)(((int)(x+0.5))*1.08)==n){
    System.out.println((int)(x+0.5));
    System.exit(0);
    }
    System.out.println(":(");
   
}
}