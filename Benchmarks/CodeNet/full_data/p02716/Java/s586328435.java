
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long odd = 0L;
        long even =0L;
        long minOdd = Long.MAX_VALUE;
       // long minEven = Long.MAX_VALUE;
        String[] in =br.readLine().split(" ");
        for(int i=0;i<n;i++){
            int a = Integer.parseInt(in[i]);
            if(i%2==0){
                odd+=a;
                minOdd = Math.min(minOdd, a);
            }else{
                even+=a;
            }
        }
        long ans;
        if(n%2!=0){
            odd-=minOdd;
        }
        if(odd>even){
            ans=odd;
        }else{
            ans=even;
        }
        System.out.println(ans);
    }
}

