import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] arg) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int ans=0;
        n*=2;
        while(n>0){
            ans+=(n%10);
            n/=10;
        }
        System.out.println(ans);
    }
}
