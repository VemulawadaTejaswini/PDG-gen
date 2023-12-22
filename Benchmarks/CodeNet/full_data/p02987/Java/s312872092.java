								//package Dynamic;
import java.io.*;
import java.util.*;
class Main
{
    static public void main(String[] args) throws IOException 
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int ar[]=new int[n];
      StringTokenizer st=new StringTokenizer(br.readLine());
//        int a=Integer.parseInt(st.nextToken());
//        int b=Integer.parseInt(st.nextToken());
//        int c=Integer.parseInt(st.nextToken());
        //int d=Integer.parseInt(st.nextToken());
       int i=0;
        while(st.hasMoreTokens())
        {
        	ar[i++]=Integer.parseInt(st.nextToken());
        }
        int c=0;
        for(int x=1;x<n-1;x++)
        {
        	int arr[]=new int[3];
        	arr[0]=ar[x];
        	arr[1]=ar[x-1];
        	arr[2]=ar[x+1];
        	Arrays.sort(arr);
        	if(arr[1]==ar[x])
        		c++;
        }
        System.out.println(c);
//        for(int x=0;x<n;x++)
//        {
//        	
//        }
        
        
    }
}
