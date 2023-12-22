import java.util.*;
import java.io.*;

/*
   AtCoder contest
   coder : yoichidon
 */


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        int max = 0;
        for(int n=0; n<N; n++){
            int L = sc.nextInt();
            sum += L;
            max = Math.max(max,L);
        }
        System.out.println(sum-max>max ? "Yes" : "No");
    }
}
