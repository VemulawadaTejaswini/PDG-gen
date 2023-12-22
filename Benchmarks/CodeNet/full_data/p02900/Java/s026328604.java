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
		long a = s.nextLong();
		long b = s.nextLong();
		HashSet<Long> set = new HashSet<>();
		printAllDivisors(a,b,set);
		ArrayList<Long> list = new ArrayList<>(set);
        System.out.println(primeCount(list)+1);
	}
    public static long gcd(long a, long b) 
    { 
    if (a == 0) 
        return b; 
    return gcd(b % a, a); 
    } 
    public static void printAllDivisors(long a,long b ,HashSet<Long> divisors) 
    {    
    long g = a; 
        g = gcd(b, g); 
 
        for (long i = 1; i * i <= g; i++) 
        { 
            if (g % i == 0)  
            { 
                divisors.add(i); 
                if (g / i != i) 
                    divisors.add(g / i); 
            } 
        }
    } 
    static long primeCount(ArrayList<Long> list) 
    { 
        // Find maximum value in the array 
        //.*max_element(arr, arr+n); 
        long max_val = Collections.max(list); 
  
        // USE SIEVE TO FIND ALL PRIME NUMBERS LESS 
        // THAN OR EQUAL TO max_val 
        // Create a boolean array "prime[0..n]". A 
        // value in prime[i] will finally be false 
        // if i is Not a prime, else true. 
        Boolean[] prime = new Boolean[(int)max_val + 1]; 
        for (long i = 0; i < max_val + 1; i++)  
        { 
            prime[(int)i] = true; 
        } 
  
        // Remaining part of SIEVE 
        prime[0] = false; 
        prime[1] = false; 
        for (long p = 2; p * p <= max_val; p++)  
        { 
  
            // If prime[p] is not changed, then 
            // it is a prime 
            if (prime[(int)p] == true)  
            { 
  
                // Update all multiples of p 
                for (long i = p * 2; i <= max_val; i += p) 
                { 
                    prime[(int)i] = false; 
                } 
            } 
        } 
        long count = 0; 
        for (int i = 0; i < list.size(); i++) 
        {   long lol = list.get(i);
            if (prime[(int)(lol)]) 
            { 
                count++; 
            } 
        } 
  
        return count; 
    } 
}