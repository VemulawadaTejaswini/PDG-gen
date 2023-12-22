import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());

		int a = (int) (A / 0.08);
		int b = (int) (B / 0.1);
		if(a==b) {
			System.out.println(a);
			return;
		}

		for(int i=Math.min(a, b); i<=Math.max(a, b);i++) {
//			System.out.println(a+""+b);
//			System.out.println(i*0.08+"   "+i*0.1);
			if((int)(i * 0.08) == (int)(i*0.1)) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);

	}
}