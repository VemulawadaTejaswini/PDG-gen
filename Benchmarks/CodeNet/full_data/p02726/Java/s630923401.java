import java.util.*;
import java.util.function.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt()-1;
        int B = sc.nextInt()-1;
        int[] ans = new int[N];
        for(int I=0; I<N; I++) for(int J=I+1; J<N; J++){
            int d = J-I;
            d = Math.min(d, Math.abs(I-A) + 1 + Math.abs(J-B));
            d = Math.min(d, Math.abs(I-B) + 1 + Math.abs(J-A));
            ans[d]++;
        }
        for(int d=1; d<N; d++) System.out.println(ans[d]);
    }
}
