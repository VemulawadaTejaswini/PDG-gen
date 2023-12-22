import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int m = sc.nextInt();
		int num = 0;

		int[] array = {1,6,9,36,81,216,729,1296,6561,7776,46656,59049};

		for(int j=11;j>=0;j--) {
			while(m >= array[j]) {
				m -= array[j];
				num += 1;
			}
		}

		System.out.println(num);

	}

}