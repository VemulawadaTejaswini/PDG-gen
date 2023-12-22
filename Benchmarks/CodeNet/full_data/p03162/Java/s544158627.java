import java.util.Scanner;

public class Main {

	public static int bigger(int num1, int num2) {
		if(num1>num2) {
			return num1;
		}else {
			return num2;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];
		int[] c = new int[N];

		for(int i = 0; i < N; i++) {
			a[i] = scan.nextInt();
			b[i] = scan.nextInt();
			c[i] = scan.nextInt();
		}

		int[] sumA = new int[N];
		int[] sumB = new int[N];
		int[] sumC = new int[N];
		int count;

		if(N==0) {
			System.out.println(0);
			System.exit(1);
		}

		if(N==1) {
			System.out.println(Math.max(a[0], Math.max(b[0], c[0])));
			System.exit(1);
		}

		for(count=1; count<N;count++) {
			if(count==1) {
				sumA[0] = a[1];
				sumB[0] = b[1];
				sumC[0] = c[1];
				sumA[1] = Main.bigger(sumA[0]+b[count-1],sumA[0]+c[count-1]);
				sumB[1] = Main.bigger(sumB[0]+a[count-1],sumB[0]+c[count-1]);
				sumC[1] = Main.bigger(sumC[0]+a[count-1],sumC[0]+b[count-1]);
//				System.out.println("count="+count+" "+sumA[count]+" "+sumB[count]+" "+sumC[count]+" ");
			}else {
			sumA[count] = Main.bigger(a[count]+sumB[count-1],a[count]+sumC[count-1]);
			sumB[count] = Main.bigger(b[count]+sumA[count-1],b[count]+sumC[count-1]);
			sumC[count] = Main.bigger(c[count]+sumA[count-1],c[count]+sumB[count-1]);
//			System.out.println("count="+count+" "+sumA[count]+" "+sumB[count]+" "+sumC[count]+" ");
			}
		}

		System.out.print(Math.max(sumA[N-1], Math.max(sumB[N-1], sumC[N-1])));
		scan.close();
	}

}
