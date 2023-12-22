import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int frige_n = Integer.parseInt(sc.next());
        int chin_n = Integer.parseInt(sc.next());
        int coupon_n = Integer.parseInt(sc.next());
        
        int[] frige_prices = new int[frige_n];
        int frige_min=Integer.MAX_VALUE;
        for(int i=0; i<frige_n; i++){
            frige_prices[i] = Integer.parseInt(sc.next());
            if(frige_prices[i] < frige_min) frige_min =frige_prices[i];
        }
        
        int[] chin_prices = new int[chin_n];
        int chin_min = Integer.MAX_VALUE;
        for(int i=0; i<chin_n; i++){
            chin_prices[i] = Integer.parseInt(sc.next());
            if(chin_prices[i] < chin_min) chin_min = chin_prices[i];
        }
        
        int total_min = frige_min + chin_min;
        
        int fr=-1, ch=-1, adv=-1, sum=-1;
        for(int i=0; i<coupon_n; i++){
            fr = Integer.parseInt(sc.next());
            ch = Integer.parseInt(sc.next());
            adv = Integer.parseInt(sc.next());
            sum = frige_prices[fr-1]+chin_prices[ch-1]-adv;
            if(sum < total_min) total_min =sum;
        }
        System.out.println(total_min);
    }
    
}