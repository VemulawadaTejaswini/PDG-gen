import java.util.*;

public class q3 
{ 
	static long maxvolume(long s) 
	{ 
		long maxvalue = 0; 
		for (long i = 1; i <= s - 2; i++) 
		{ 
			for (long j = 1; j <= s - 1; j++) 
			{ 
				long k = s - i - j; 
				maxvalue = Math.max(maxvalue, i * j * k); 
			} 
		} 
	
		return maxvalue; 
	} 
	public static void main (String[] args) 
	{ 
		long s;
		Scanner s1=new Scanner(System.in);
		s=s1.nextLong(); 
		System.out.println(maxvolume(s)); 
	} 
} 