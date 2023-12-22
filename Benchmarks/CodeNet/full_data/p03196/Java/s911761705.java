import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 
 
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		long N = input.nextLong();
		long P = input.nextLong(); //Product
		long maxGCD = 1;
		for (long prime = 2; prime <= Math.sqrt(P); prime++) {
			long numCurPrime = 0;
			while (P%prime==0) {
				P/=prime;
				numCurPrime++;
				if (numCurPrime%N==0) {
					maxGCD*=prime;
					numCurPrime=0; //Effectively floor division using simulation counters
				}
			}
		}
		System.out.println(maxGCD);
	}
}