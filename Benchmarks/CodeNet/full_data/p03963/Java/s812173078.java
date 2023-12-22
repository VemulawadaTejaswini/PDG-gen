import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Long n = sc.nextLong();
		Long k = sc.nextLong();
		long num = k;
		for(int i=1; i<n; i++){
			num *= k-1;
		}
		System.out.println(num);
	}
}