import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] nk = input.readLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        int sum = 0;
        double sumMax = 0;
        String[] pn = input.readLine().split(" ");
        for(int i=0;i<=n-k;i++){
            for(int j=i;j<k+i;j++){
                sum = sum + Integer.parseInt(pn[j]);
            }
            if(sumMax <= sum){
                sumMax = sum;
            }
            sum = 0;
        }
        double ans = (sumMax + k)/2;
        System.out.println(String.format("%.7f", ans));

    }
}