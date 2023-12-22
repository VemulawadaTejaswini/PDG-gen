							//	package Dynamic;
import java.io.*;
import java.util.*;
class Main
{
    static public void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        int t=Integer.parseInt(br.readLine());
//        while(t-->0)
//        {
//        	int n=Integer.parseInt(br.readLine());
//        	int ar[]=new int[n];
        	StringTokenizer st=new StringTokenizer(br.readLine());
        	int a=Integer.parseInt(st.nextToken());
        	int b=Integer.parseInt(st.nextToken());
        	//int c=Integer.parseInt(st.nextToken());
//        	for(int x=0;x<n;x++)
//        	{
//        		ar[x]=Integer.parseInt(st.nextToken());
//        	}
        	System.out.println((int)Math.ceil(a/((b*2.0)+1)));
        //}
    }
}