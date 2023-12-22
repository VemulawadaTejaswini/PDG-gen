
import java.math.*;
import java.io.*;
import java.util.*;

public class Main {
public static int gcd(int a, int b) 
    { 
      if (b == 0) 
        return a; 
      return gcd(b, a % b);  
    }
public static void main(String[] args) throws Exception{

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      	int n = Integer.parseInt(br.readLine());
      	int count = 0;
      	for(int i = 1; i <= n; i++)
      	{
      		for(int j = 1; j <= n; j++)
      		{
      			for(int k = 1; k <= n; k++)
      			{
      				count += gcd(gcd(i,j),k);
      			}
      		}
      	}
      	System.out.println(count);
    }

}


