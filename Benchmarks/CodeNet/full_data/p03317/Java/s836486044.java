import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long K = sc.nextLong();
		long a[] = new long[N];
		long place = 0;
		for(long i=0; i<N; i++){
			a[i] = sc.nextLong();
			if(a[i]==1)place = i;
		}
		long num1 = 0;
      	long num2 = 0;
		num1 += (place+K-2)/(K-1);
		num2 += (N-place+K-3)/(K-1);
		System.out.println(num1+num2);
	}
}