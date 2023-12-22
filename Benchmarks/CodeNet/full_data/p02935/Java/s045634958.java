import java.io.*;
import java.util.Arrays;


public class Main {
	public static void main(String [] args) throws IOException
	  {
	    InputStreamReader ir=new InputStreamReader(System.in);
	    BufferedReader br=new BufferedReader(ir);
	    int n=Integer.parseInt(br.readLine());
	    String [] s=br.readLine().split(" ");
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	    	arr[i]=Integer.parseInt(s[i]);
	    }
	    Arrays.sort(arr);
	    double value=arr[0];
	    for(int i=1;i<n;i++)
	    {
	    	value=((double)value+arr[i])/2;
	    }
	    System.out.println(value);
	  }
}
