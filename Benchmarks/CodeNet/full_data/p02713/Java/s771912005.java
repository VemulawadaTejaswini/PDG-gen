import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

    public static int gcd(int a,int b)
    {
        if(b==0)
            return a;
        else
            return gcd(b,a%b);
    }

    public static void main(String[] args) throws IOException {
        // write your code here

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(reader.readLine());

        long ans=0;
        
        for(int i=1;i<=k;i++)
        {
            for(int j=1;j<=k;j++)
            {
                for(int l=1;l<=k;l++)
                {
                    ans+=gcd(gcd(i,j),l);
                }
            }
        }

        System.out.println(ans);

    }
}
