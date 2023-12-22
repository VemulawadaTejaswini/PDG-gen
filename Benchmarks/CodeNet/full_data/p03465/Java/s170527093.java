import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int K = in.nextInt();
        int[] A = new int[K];
        for(int i =0; i< K; i++){
            A[i] = in.nextInt();
        }
        Arrays.sort(A);
        int ans = 0;
        if (K==1){
            ans=A[0];
        }else {
            for(int i = 0; i < K-1; i++){
                ans+=A[i];
            }
        }
        System.out.println(ans);
        in.close();
    }
}
