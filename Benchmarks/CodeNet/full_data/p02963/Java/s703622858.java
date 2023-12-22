							//	package Dynamic;
import java.io.*;
import java.util.*;
class Main{
    static public void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        int t=Integer.parseInt(br.readLine());
//        while(t-->0)
//        {
//        	int n=Integer.parseInt(br.readLine());
//        	int ar[]=new int[n];
//        	StringTokenizer st=new StringTokenizer(br.readLine());
        	//int a=Integer.parseInt(st.nextToken());
        	//int b=Integer.parseInt(st.nextToken());
        	//int c=Integer.parseInt(st.nextToken());
//        	for(int x=0;x<n;x++)
//        	{
//        		ar[x]=Integer.parseInt(st.nextToken());
//        	}
        long a=Long.parseLong(br.readLine());
        long v=1l;
        
        while(true)
        {
        	double d=(1.0*a)/v;
        	long dd=(long)(d);
        	double ddd=dd*1.0;
        	
        	if(d==ddd&&dd*v==a)
        	{
        		//System.out.println(v+" "+d+" "+dd+" "+ddd);
        	
        	
        		break;
        	}
        	else
        		v++;
        }
        //System.out.println(576403206l*539751978l);
        	System.out.println("0 "+v+" 0 0 "+(a/v)+" 0");
        //}
    }
}