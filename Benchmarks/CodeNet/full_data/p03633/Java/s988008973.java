import java.util.Scanner;

class Main{


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		long ans = 0;
		long t = sc.nextLong();

		for(int i = 1;i < n;i++){
			long x = sc.nextLong();
			t =(long)lcm((long)t, (long)x);


		}
		System.out.println(t);

	}

	static long lcm (long a, long b) {
		if(a*b <= 0){

			return (long)Math.max(a, b);
		}
		long temp = 1L;
		long c = (long)a;
		c *= (long)b;
		while((temp = a%b)!=0) {
			a = (long)b;
			b = (long)temp;
		}
		return (long)(c/b);
	}

}