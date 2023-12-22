import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String[] args)throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String[]s=bufferedReader.readLine().split( " ");
        long k=Long.parseLong(s[0]),a=Long.parseLong(s[1]),b=Long.parseLong(s[2]);
        if(a>=b)
        {
            System.out.println(k+1);
        }
        else
        {
            long a1=a;
            a+=2;
            k-=(a1-1);
            k-=2;
            long m = k%a;
            k-=m;
            if(k>=0) {
                long ans=b;
                ans += ((k / a) * b) + (m);
                System.out.println(ans);
            }
            else {
                long ans = k+1;
                System.out.println(ans);
            }
        }
    }
}