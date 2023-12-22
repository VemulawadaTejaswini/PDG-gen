import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        int count = 0;
        
        int n = stdIn.nextInt();
        double tw = stdIn.nextInt();
        double aw = stdIn.nextInt();
        
        double tc = 0;
        double ac = 0;
        
        if(tw != 0){
            tc = (100 / tw)* n;
        }
        
        if(aw != 0){
            ac = (100 / aw)* n;
        }
        
        System.out.println(tc);
        System.out.println(ac);
        
        if(tc != 0 && ac != 0){
            System.out.printf("%.0f", (tc + ac) / 4);
        }else if(tc == 0){
            System.out.printf("%.0f", ac);
        }else{
            System.out.printf("%.0f", tc);
        }
    }
}