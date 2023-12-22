import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for (int i = 1;i <= 9&&i <= k;++i){
            System.out.println(i);
        }
        int c = 9;
        int n = 19;
        while (c < k){
            String s1 = String.valueOf(n);
            String s2  = String.valueOf(n + 10);
            double t1 = 0,t2 = 0;
            for (int i = 0;i < s1.length();++i){
                t1 += Integer.valueOf(s1.charAt(i) + "");
            }
            for (int i = 0;i < s2.length();++i){
                t2 += Integer.valueOf(s2.charAt(i) + "");
            }
            if((n / t1) < ((n + 10) / t2)){
                System.out.println(n);
                ++c;
            }
            n += 10;
        }
    }




}
