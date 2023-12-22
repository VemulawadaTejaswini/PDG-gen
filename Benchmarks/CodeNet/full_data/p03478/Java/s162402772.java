import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		int sum=0;
		for (int a=0;a<10;a++) {
			for (int b=0;b<10;b++) {
				for (int c=0;c<10;c++) {
					for (int d=0;d<10;d++) {
						if (A<=a+b+c+d && a+b+c+d<=B && a*1000+b*100+c*10+d<=N) {
							sum+=a*1000+b*100+c*10+d;
						}

					}
				}
			}
		}
		System.out.println(sum);
	}
}