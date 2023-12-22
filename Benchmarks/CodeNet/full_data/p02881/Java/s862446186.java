import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long min = 0;
		long x = (long) Math.sqrt((double)N);
		for(int i = 1;i < x;i++){
			if(N % i == 0) min = i;
		}

		System.out.println(min - 1 + N/min - 1);
	}
}






