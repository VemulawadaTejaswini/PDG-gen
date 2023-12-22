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
		int count=0;

		for(int i=n-2;i>=0;i--) {
			if(array[i] == buff-1) {
				buff = array[i];
			}else {
				count++;
			}
		}
		if(buff == 1) {
			System.out.println(count);
		}else {
			System.out.println(-1);
		}


	}
	public static int res(int a,int b) {
		int res=0;

		return res(b,res);
	}
}


