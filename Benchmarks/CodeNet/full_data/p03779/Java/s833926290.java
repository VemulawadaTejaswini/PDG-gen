import java.util.*;
public class ABC056_C{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long sum = 0;
		long i = 0;
		while(sum<x){
			sum+=(i+1);
			i++;
		}
		System.out.println(i);
		return;
	}
}