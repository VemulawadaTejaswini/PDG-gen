package bluebridge.t1;

import java.util.*;
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] agrs){
        int A, B, C, D;
        int ans;
        while(sc.hasNext()){
            ans = 0;
            A = sc.nextInt();
            B = sc.nextInt();
            C = sc.nextInt();
            D = sc.nextInt();
            ans = ((B + C) < (B + D) ? (B + C) : (B + D)) < ((A + C) < (A + D) ? (A + C) : (A + D)) ? ((B + C) < (B + D) ? (B + C) : (B + D)) : ((A + C) < (A + D) ? (A + C) : (A + D));
            System.out.println(ans);
        }
    }
}
