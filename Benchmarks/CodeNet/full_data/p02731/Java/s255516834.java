import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
        PrintWriter pw=new PrintWriter(System.out);
        int dim=Integer.parseInt(br.readLine());
        if(dim%3==0)
        pw.println(Math.pow(dim/3,3));
        else if(dim%3==0)
        pw.println(Math.pow(dim/3,2)*(dim/3+1));
        else
        pw.println(Math.pow(dim/3+1,2)*(dim/3));
        pw.flush();
        pw.close();
    }
}