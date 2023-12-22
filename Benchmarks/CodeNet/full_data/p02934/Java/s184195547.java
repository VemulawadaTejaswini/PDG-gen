import java.io.*;

public class Main {
	public static void main(String [] args) throws IOException
	  {
	    InputStreamReader ir=new InputStreamReader(System.in);
	    BufferedReader br=new BufferedReader(ir);
	    int n=Integer.parseInt(br.readLine());
	    String [] s=br.readLine().split(" ");
	    int arr[]=new int[n];
	    long product=1;
	    for(int i=0;i<n;i++)
	    {
	    	arr[i]=Integer.parseInt(s[i]);
	    	product*=arr[i];
	    }
	    long sum_product=0;
	    for(int i=0;i<n;i++)
	    {
	    	sum_product=sum_product + (product/arr[i]);
	    }
	    double ans=(double)product/sum_product;
	    boolean check=isInteger(ans);
	    if(check)
	    {
	    	System.out.println((int)ans);
	    }
	    else
	    System.out.println(ans);
	    
	  }
	public static boolean isInteger(double number){
	    return Math.ceil(number) == Math.floor(number); 
	}

}
