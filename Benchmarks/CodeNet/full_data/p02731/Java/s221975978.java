import java.util.*;

public class Main
{ 
	static double maxvolume(double s) 
	{ 
		double maxvalue = 0; 
		for (double i = 1; i <= s - 2; i++) 
		{ 
			for (double j = 1; j <= s - 1; j++) 
			{ 
				double k = s - i - j; 
				maxvalue = Math.max(maxvalue, i * j * k); 
			} 
		} 
	
		return maxvalue; 
	} 
	public static void main (String[] args) 
	{ 
		double s;
		Scanner s1=new Scanner(System.in);
		s=s1.nextDouble(); 
		System.out.println(maxvolume(s)); 
	} 
} 