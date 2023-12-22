import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        char[] c = new char[N];
        char[] assign = new char[N];
        int min = N;
        int max = 0;
        for(int i = 0; i < N; i++){
            x[i] = in.nextInt();
            y[i] = in.nextInt();
            c[i] = in.next().charAt(0);    
        }
        for(int i = 0; i < K*K; i++){
            int match = 0;    
            for(int j = 0; j < N; j++){
                int y_assign = ((y[j] + (i / K)+1) / K ) % 2;
                int x_assign = ((x[j] + (i % K)+1) / K ) % 2;
                if ((x_assign+y_assign)%2== 0){
                    if(c[j] == 'W'){
                        match++;
                    }
                }else{
                    if(c[j] == 'B'){
                        match++;
                    }    
                }
            }
            if (match > max){
                max = match;
            }
            if (match < min){
                min = match;
            }
        }
        if(max < N/2){
            max = N -min;
        }
        System.out.println(max);

        in.close();
    }
}
