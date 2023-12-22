import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] s = br.readLine().split(" ");
		
		int [] num = new int[s.length];
		int dividefour = 0;
		int odd = 0;
	    int even = 0;
		for(int i = 0;i<num.length;i++){
		    num[i] = Integer.parseInt(s[i]);
		    if(num[i] % 2 == 0){
		        even++;
		    }else{
		        odd++;
		    }
		    if(num[i] % 4 == 0){
		        dividefour++;
		    }
		}
		
		if((dividefour > odd - 1 && even % 2 == 0)){
		    System.out.println("Yes");
		}
		else{
		    System.out.println("No");
		}
		//System.out.println(dividefour + " " + odd + " " + even);
	}
}
