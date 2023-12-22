import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] a = new int[N];
		for(int i=0; i<N; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		int tmp=0;
		boolean flag = true;
		for(int i=0; i<N; i++) {

			if(i+1 != a[i]) {
				if(tmp == 0) {
					tmp = a[i];
				}else if(tmp == i+1){

				}else {
					flag = false;
					break;
				}
			}
		}

		if(flag == true) {
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}