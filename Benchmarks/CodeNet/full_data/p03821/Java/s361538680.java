import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                long[] a = new long[n];
                long[] b = new long[n];
                for(int i = 0 ; i < n ; i++){
                        a[i] = sc.nextLong();
                        b[i] = sc.nextLong();
                }
                long pct = 0;
                sc.close();
                for(int i = 0 ; i < n ; i++){
                        long yono = (b[n - i - 1] - a[n - i - 1] % b[n - i - 1]) % b[n - i - 1];
                        pct += yono;
                        for(int j = 0 ; j < n - i ; j++){
                                a[j] += yono;
                        }
                }
                System.out.println(pct);
        }
}
//give me AC!!
//＿＿＿＿＿＿＿＿＿＿pct