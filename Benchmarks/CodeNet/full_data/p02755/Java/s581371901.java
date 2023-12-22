import java.util.*;
import java.lang.*;
public class Main {
        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            double rateA=.08;
            double rateB=.1;
            double aPrice = (A/rateA);
            int bPrice = (int)(aPrice*rateB);
            if(bPrice==B){
                System.out.println((int)aPrice);
            }else{
                System.out.println(-1);
            }

    }
}



