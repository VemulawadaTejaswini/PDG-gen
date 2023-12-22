import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int a[] = new int[num*3];
		long sum = 0;
		int box;
		int all = num*3;

		for(int i=0; i<all; i++) {
			a[i] = scan.nextInt();

			for(int j=i; j>0; j--){
				if(a[j-1]<a[j]){
					box = a[j-1];
					a[j-1] = a[j];
					a[j] = box;
				}else {
					break;
				}
			}
		}

		for(int i=1; i<num*2; i=i+2){
			sum += a[i];
		}

		System.out.println(sum);

	}

}
