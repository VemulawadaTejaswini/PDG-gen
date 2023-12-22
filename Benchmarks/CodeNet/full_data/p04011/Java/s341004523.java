

import java.math.BigDecimal;
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int c = 0;
        for (int i=0; i<n; i++){
            if (i<k){
                c += x;
            }else{
                c += y;
            }
        }
        System.out.println(c);
    }
}