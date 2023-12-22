import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bis=new BufferedReader(new InputStreamReader(System.in));
        String s= bis.readLine();
        int l=s.length();
        int ans=0;
        for (int i = 0; i < l; i++)
        {
            char c=s.charAt(i);
            if(c=='+')
            {
                ans+=1;
            }
            if(c=='-')
            {
                ans-=1;
            }
        }
        System.out.println(ans);
    }
}
