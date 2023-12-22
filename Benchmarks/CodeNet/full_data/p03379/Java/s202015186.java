import java.util.Arrays;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String[] b = s.split(" ",0);
        int[] X = new int[N];
        for(int i = 0;i<N;i++){
            X[i] = Integer.valueOf(b[i]);
        }
        int[] Y = new int[N];
        for(int i = 0;i<N;i++){
            for(int j = 0;j<N;j++){
                if(i == j){
                    continue;
                }else{
                    Y[j] = X[j];
                }
            }
            Arrays.sort(Y);
            // for(int k = 0;k<Y.length;k++){
            //     System.out.println(Y[k]);
            // }
            System.out.println(Y[(Y.length)/2]);
            Arrays.fill(Y, 0);
        }
    }
}