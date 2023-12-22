import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int n = 1;
        for(int i = 0; i < K;){
            if (n/sunuke(n) <= (n+1)/sunuke(n+1) && n/sunuke(n) <= (n+2)/sunuke(n+2) && n/sunuke(n) <= (n+3)/sunuke(n+3)
            && n/sunuke(n) <= (n+4)/sunuke(n+4) && n/sunuke(n) <= (n+5)/sunuke(n+5) && n/sunuke(n) <= (n+6)/sunuke(n+6)
            && n/sunuke(n) <= (n+7)/sunuke(n+7) && n/sunuke(n) <= (n+8)/sunuke(n+8) && n/sunuke(n) <= (n+9)/sunuke(n+9)){
                System.out.println(n);
                n++;
                i++;
            }else{
                n++;
            }
        }
    }
    static double sunuke(int n){
        double sn = 0;
        String sns = String.valueOf(n);
        for(int h = 0; h < sns.length(); h++){
            sn += Character.getNumericValue(sns.charAt(h));
        }
        return sn;
    }
}