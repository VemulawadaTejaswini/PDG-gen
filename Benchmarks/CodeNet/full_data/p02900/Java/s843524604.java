/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public final class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		HashSet<Integer> set = new HashSet<>();
		printAllDivisors(a,b,set);
		ArrayList<Integer> list = new ArrayList<>(set);
        System.out.println(primeCount(list)+1);
	}
    public static int gcd(int a, int b) 
    { 
    if (a == 0) 
        return b; 
    return gcd(b % a, a); 
    } 
    public static void printAllDivisors(int a,int b ,HashSet<Integer> divisors) 
    {    
    int g = a; 
        g = gcd(b, g); 
 
        for (int i = 1; i * i <= g; i++) 
        { 
            if (g % i == 0)  
            { 
                divisors.add(i); 
                if (g / i != i) 
                    divisors.add(g / i); 
            } 
        }
    } 
    static int primeCount(ArrayList<Integer> list) 
    { 
        // Find maximum value in the array 
        //.*max_element(arr, arr+n); 
        int max_val = Collections.max(list); 
  
        // USE SIEVE TO FIND ALL PRIME NUMBERS LESS 
        // THAN OR EQUAL TO max_val 
        // Create a boolean array "prime[0..n]". A 
        // value in prime[i] will finally be false 
        // if i is Not a prime, else true. 
        Boolean[] prime = new Boolean[max_val + 1]; 
        for (int i = 0; i < max_val + 1; i++)  
        { 
            prime[i] = true; 
        } 
  
        // Remaining part of SIEVE 
        prime[0] = false; 
        prime[1] = false; 
        for (int p = 2; p * p <= max_val; p++)  
        { 
  
            // If prime[p] is not changed, then 
            // it is a prime 
            if (prime[p] == true)  
            { 
  
                // Update all multiples of p 
                for (int i = p * 2; i <= max_val; i += p) 
                { 
                    prime[i] = false; 
                } 
            } 
        } 
        int count = 0; 
        for (int i = 0; i < list.size(); i++) 
        { 
            if (prime[list.get(i)]) 
            { 
                count++; 
            } 
        } 
  
        return count; 
    } 
}