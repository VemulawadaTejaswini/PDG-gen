import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
        PrintWriter pw=new PrintWriter(System.out);
        String s=br.readLine();
        String s1=s.substring(0,s.length()/2);
        String s2=s.substring(s.length()/2+1,s.length());
        for(int i=0;i<s1.length()/2;i++)
        {
            if(s1.charAt(i)!=s1.charAt(s1.length()-1-i))
            {
                pw.println("No");
                pw.flush();
                pw.close();
                return;
            }
        }
        for(int i=0;i<s2.length()/2;i++)
        {
            if(s2.charAt(i)!=s2.charAt(s2.length()-1-i))
            {
                pw.println("No");
                pw.flush();
                pw.close();
                return;
            }
        }
        for(int i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
            {
                pw.println("No");
                pw.flush();
                pw.close();
                return;
            }
        }
        pw.println("Yes");
        pw.flush();
        pw.close();
    }
}
