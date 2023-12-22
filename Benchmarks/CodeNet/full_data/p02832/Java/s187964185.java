import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];

		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
		}

		int buff = array[n-1];
		int count=0,count2=0;

		for(int i=n-2;i>=0;i--) {
			if(array[i] == buff-1) {
				buff = array[i];
			}else {
				count++;
			}
			if(buff-1 == 0 && array[i]==1) {
				count2++;
			}
		}
		if(array[n-1]==1) {
			if(count2 == n-1) {
				System.out.println(count);
			}else {
				System.out.println(-1);
			}
		}
		else if(buff == 1) {
			System.out.println(count);
		}else {
			System.out.println(-1);
		}


	}
}


