
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

 public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        long ans=0L;
        for(int i=1;i<=k;i++){
            for(int j=1;j<=k;j++){
                int gcd = gcd(i,j);
                for(int s = 1;s<=k;s++){
                    int g = gcd(gcd,s);
                    ans+=g;
                }
            }
        }
        System.out.println(ans);
    }
     static int gcd(int a, int b)
     {
         if (b == 0)
             return a;
         return gcd(b, a % b);
     }
 }
