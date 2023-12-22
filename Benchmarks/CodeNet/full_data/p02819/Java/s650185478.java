/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//long a = System.currentTimeMillis();
		System.out.println(solve(Integer.parseInt(reader.readLine())));
		//long b = System.currentTimeMillis();
		//System.out.println(b-a);
		
	}
	public static boolean isPrime(int n){
	    if(n==2) return true;
	    if(n%2==0) return false;
	    else{
	        int i = 3;
	        while(i*i<=n){
	            if(n%i==0) return false;
	            i++;
	        }
	        return true;
	    }
	}
	public static int solve(int n){
	    if(isPrime(n)) return n;
	    else return solve(n+1); 
	}
}
