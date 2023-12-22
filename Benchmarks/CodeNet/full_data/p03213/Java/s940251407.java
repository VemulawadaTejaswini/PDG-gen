import java.io.*;
import java.util.*;

public class Main{
    static MyReader in = new MyReader();
    static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args){
        int N = in.i();
        int[] prime = new int[N];
        int size = 0;
        prime[size++] = 2;
        for(int i = 3, k = 0; i < N; i++){
            boolean b = true;
            if(prime[k]*prime[k] < i) k++; 
            for(int j = 0; j <= k; j++){
                if(i%prime[j] == 0){
                    b = false;
                    break;             
                }
            } if(b) prime[size++] = i;
        }

        int[] count = new int[size];
        for(int i = 0; i < count.length; i++){
            int j = 0;
            int p = prime[i];
            int tmp = 0;
            while(p < N){
                tmp += N/p;
                p *= prime[i];
                j++;
            }
            count[i] = tmp;
        }

        int ans = 0;

        for(int i = 0; 74 <= count[i]; i++) ans++;

        for(int i = 0; 24 <= count[i]; i++)
            for(int j = 0; 2 <= count[j]; j++)
                if(i == j) continue;
                else ans++;               

        for(int i = 0; 14 <= count[i]; i++)
            for(int j = 0; 4 <= count[j]; j++)
                if(i == j) continue;
                else ans++;

        for(int i = 0; 4 <= count[i]; i++)
            for(int j = i+1; 4 <= count[j]; j++)
                for(int k = 0; 2 <= count[k]; k++)
                    if(k == i || j == k) continue;
                    else ans++;

        out.println(ans);
        out.flush();
    }

    static class MyReader extends BufferedReader{
        MyReader(){
            super(new InputStreamReader(System.in));
        }

        String s(){
            try{return readLine();}catch(IOException e){return "";}
        }

        String[] ss(){
            return s().split(" ");
        }

        int i(){
            return Integer.parseInt(s());
        }

        int[] ii(){
            String[] ss = ss();
            int[] ii = new int[ss.length];
            for(int j = 0; j < ss.length; j++) ii[j] = Integer.parseInt(ss[j]);
            return ii;
        }

        long l(){
            return Long.parseLong(s());
        }

        long[] ll(){
            String[] ss = ss();
            long[] ll = new long[ss.length];
            for(int j = 0; j < ss.length; j++) ll[j] = Long.parseLong(ss[j]);
            return ll;
        }
    }
}
