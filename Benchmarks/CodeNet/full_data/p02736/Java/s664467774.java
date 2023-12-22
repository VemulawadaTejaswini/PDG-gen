import java.io.*;
import java.util.*;
class Main
{
	public static void main(String[] args) throws Exception
    {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      	int n = Integer.parseInt(br.readLine());
      	String num = br.readLine();
      	int even = 0;
      	int odd = 0;
      	for(int i = 0 ; i < n ; i++)
        {
        	if(i%2==0) even += Integer.parseInt(String.valueOf(num.charAt(i)));
          	else odd += Integer.parseInt(String.valueOf(num.charAt(i)));
        }
      if(n%2==0)	System.out.println(odd-even);
      else System.out.println(odd-even+1);
    }
      
}