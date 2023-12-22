// 2019/07/02
// AtCoder Beginner Contest 079 - A

import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Input
        int n = sc.nextInt();
        int s = (int)(n / 1000);
        int h = (int)(n / 100 % 10);
        int t = (int)(n / 10 % 10);
        int o = (n % 10);
        String ans = "";

        // Check
       if((s == h && h == t) || (h == t && t == o)){
           ans = "Yes";
       } else {
           ans = "No";
       }
       
       // Output
       System.out.println(ans);
    }
}