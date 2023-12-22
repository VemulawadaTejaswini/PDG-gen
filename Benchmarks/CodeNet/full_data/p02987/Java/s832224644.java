								//package Dynamic;
import java.io.*;
import java.util.*;
public class abc 
{
    static public void main(String[] args) throws IOException 
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //int n=Integer.parseInt(br.readLine());
        //int ar[]=new int[n];
//        StringTokenizer st=new StringTokenizer(br.readLine());
//        int a=Integer.parseInt(st.nextToken());
//        int b=Integer.parseInt(st.nextToken());
//        int c=Integer.parseInt(st.nextToken());
        //int d=Integer.parseInt(st.nextToken());
//        int i=0;
//        while(st.hasMoreTokens())
//        {
//        	ar[i++]=st.nextToken();
//        }
        //System.out.println();
//        for(int x=0;x<n;x++)
//        {
//        	
//        }
        
        String s=br.readLine();
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        s=new String(ch);
        if((s.charAt(0)==s.charAt(1))&&(s.charAt(2)==s.charAt(3))&&s.charAt(0)!=s.charAt(2))
        	System.out.println("Yes");
        else
        	System.out.println("No");
    }
}
