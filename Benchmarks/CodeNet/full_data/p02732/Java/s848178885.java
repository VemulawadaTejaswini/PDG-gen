
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		long[] a = new long[n];
		for(int i=0;i<n;i++) a[i] = input.nextLong();
		
		long tot = 0;
		HashMap<Long,Long> hmap = new HashMap<Long,Long>();
		
		for(int i=0;i<n;i++){
		    hmap.put(a[i],hmap.getOrDefault(a[i],(long)0)+1);
		}
		
		for(Map.Entry<Long,Long> e:hmap.entrySet()){
		    long v = e.getValue();
		    tot += (v*(v-1))/2;
		}
		
		for(int i=0;i<n;i++){
		    long v = hmap.get(a[i]);
		    long val = tot;
		    val -= (v*(v-1))/2;
		    v--;
		    val += (v*(v-1))/2;
		    
		    System.out.println(val);
		}
	}
}
