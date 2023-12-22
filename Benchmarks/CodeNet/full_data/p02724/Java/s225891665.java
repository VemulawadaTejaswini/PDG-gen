//created by Whiplash99
import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int i,N;

        long X=Long.parseLong(br.readLine().trim());
        long ans=1000L*(X/500);
        X%=500;
        ans+=5*(X%5);

        System.out.println(ans);
    }
}