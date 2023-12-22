import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class atcoder {
    public static void main(String[] args)throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String[] s = bufferedReader.readLine().split(" ");
        long n = Long.parseLong(s[0]),k=Long.parseLong(s[1]);
        long ans = (long) Math.ceil((double)n/2);
        if(ans>=k)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
