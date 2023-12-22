import java.math.BigInteger;
import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int a_4 = 0;
        int b = 0;
        for(int i = 0; i < n; i++) {
            int m = sc.nextInt();
            if (m % 4 == 0) {
                a_4++;
            } else if (m % 2 != 0) {
                b++;
            }
        }
            if(n / 2 <= a_4 || a_4 >= b){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
    }
}