
import java.math.*;
import java.io.*;
import java.util.*;

public class Main {
public static void main(String[] args) throws Exception{

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      	int n = Integer.parseInt(br.readLine());
      	long sum = (((long)(n+1)) * n)/(long)2;
      	long sum_3 = 0;
      	if(n % 3 == 0)
      	{
      		sum_3 = ((long)(n/3) * ((long)3 + (long)n))/(long)2;
      	}
      	else
      	{
      		int count_3 = n;
      		int r = count_3 % 3;
      		count_3 = count_3 - r;
      		sum_3 = ((long)(count_3/3) * ((long)3 + (long)count_3))/(long)2;
      	}
      	long sum_5 = 0;
      	if(n % 5 == 0)
      	{
      		sum_5 = ((long)(n/5) * ((long)5 + (long)n))/(long)2;
      	}
      	else
      	{
      		int count_5 = n;
      		int r = count_5 % 5;
      		count_5 = count_5 - r;
      		sum_5 = ((long)(count_5/5) * ((long)5 + (long)count_5))/(long)2;
      	}
      	long sum_15 = 0;
      	if(n % 15 == 0)
      	{
      		sum_15 = ((long)(n/15) * ((long)15 + (long)n))/(long)2;
      	}
      	else
      	{
      		int count_15 = n;
      		int r = count_15 % 15;
      		count_15 = count_15 - r;
      		sum_15 = ((long)(count_15/15) * ((long)15 + (long)count_15))/(long)2;
      	}
      	System.out.println(sum -sum_5 - sum_3 + sum_15);
    }

}


