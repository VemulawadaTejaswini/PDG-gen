import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String[] args)throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String[] s = bufferedReader.readLine().split(" ");
        String[] s1 = bufferedReader.readLine().split(" ");
        String[] s2 = bufferedReader.readLine().split(" ");
        long p1=-1,p2=-1;
        boolean one=false,two=false,three=false;
        if(Long.parseLong(s[0])==Long.parseLong(s1[0]))
        {
            p1 = Long.parseLong(s[1]);
            p2 = Long.parseLong(s1[1]);
            one=true;
            two=true;
        }
        else if(Long.parseLong(s[0]) == Long.parseLong(s1[1]))
        {
            p1 = Long.parseLong(s[1]);
            p2 = Long.parseLong(s1[0]);
            one=true;
            two=true;
        }
        else if(Long.parseLong(s[0])==Long.parseLong(s2[0]))
        {
            p1 = Long.parseLong(s[1]);
            p2= Long.parseLong(s2[1]);
            one=true;
            three=true;
        }
        else if(Long.parseLong(s[0])==Long.parseLong(s2[1]))
        {
            p1=Long.parseLong(s[1]);
            p2 = Long.parseLong(s2[0]);
            one=true;
            three=true;
        }
        else if(Long.parseLong(s[1])==Long.parseLong(s1[0]))
        {
            p1 = Long.parseLong(s[0]);
            p2 = Long.parseLong(s1[1]);
            one=true;
            two=true;
        }
        else if(Long.parseLong(s[1]) == Long.parseLong(s1[1]))
        {
            p1 = Long.parseLong(s[0]);
            p2 = Long.parseLong(s1[0]);
            one=true;
            two=true;
        }
        else if(Long.parseLong(s[1])==Long.parseLong(s2[0]))
        {
            p1 = Long.parseLong(s[0]);
            p2= Long.parseLong(s2[1]);
            one=true;
            three=true;
        }
        else if(Long.parseLong(s[1])==Long.parseLong(s2[1]))
        {
            p1=Long.parseLong(s[0]);
            p2 = Long.parseLong(s2[0]);
            one=true;
            three=true;
        }
        boolean ans=false;
        if(two==false)
        {
            if(p1==Long.parseLong(s1[0])||p1==Long.parseLong(s1[1]))
            {
                ans=true;
            }
            else if(p2==Long.parseLong(s1[0])||p2==Long.parseLong(s1[1]))
            {
                ans=true;
            }
        }
        else if(three==false)
        {
            if(p1==Long.parseLong(s2[0])||p1==Long.parseLong(s2[1]))
            {
                ans=true;
            }
            else if(p2==Long.parseLong(s2[0])||p2==Long.parseLong(s2[1]))
            {
                ans=true;
            }
        }
        if(p1>-1&&p2>-1&&ans==true)
        {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}