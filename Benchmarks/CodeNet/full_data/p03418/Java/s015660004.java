import java.util.*;

public class Main {

  public static void main(String args[])
  {
    	Scanner sc = new Scanner(System.in);
    	String input = sc.nextLine();
    	String[] inputs = input.split(" ");
    	long n = Long.valueOf(inputs[0]);
    	long k  = Long.valueOf(inputs[1]);
    	long sum = 0;
  		for( long div = 1; div<=n;div++)  {
		
            long a = n/div;
          	long count = a*(div-k);
          	long r = n%div;
          	if(r>=k)
            {
              count  = count + r-k+1;
            }
          sum +=count;
       
        }
    	if(k==0)
          sum = sum - n;
    	System.out.println(sum);
  }
}