							//	package Dynamic;
import java.io.*;
import java.util.*;
class Main{
    static public void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int n=Integer.parseInt(br.readLine());
       int ar[]=new int[n];
       StringTokenizer st=new StringTokenizer(br.readLine());
        for(int x=0;x<n;x++)
        {
        	ar[x]=Integer.parseInt(st.nextToken());
        }
        for(int x=1;x<n-1;x++)
        {
        	if(ar[x]!=(ar[x-1]^ar[x+1]))
        			{
        		System.out.println("No");
        		System.exit(0);
        			}
        }
        if(ar[0]!=(ar[n-1]^ar[1])||ar[n-1]!=(ar[n-2]^ar[0]))
        	System.out.println("No");
        else
        	System.out.println("Yes");
        //
       
//        int a=Integer.parseInt(st.nextToken());
//        int b=Integer.parseInt(st.nextToken());
//        int c=Integer.parseInt(st.nextToken());
//        int d=Integer.parseInt(st.nextToken());
//        System.out.println(); 
        //}
    }
}
