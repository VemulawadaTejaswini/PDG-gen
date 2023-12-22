import java.util.Scanner;

public class Main {

	int min=999999;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		int a[] =new int[8];
		int over =0;
		N = sc.nextInt();
		for (int i=0;i<N;i++) {
			int rate = sc.nextInt();
			if (rate <3200) {
				a[rate/400]++;
			} else {
				over++;
			}
		}
		int min=0 ;
		for (int i=0;i<8;i++) {
			if (a[i]>0) {
				min++;
			}
		}
		if (min>0) {
			System.out.println(min+" "+(min+over));
		} else {
			System.out.println(1+" "+(over));
		}

	}
}