import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int array[] = new int[num];
		int ans = 0;
		int count = 0;
		for (int i = 0; i < num; i++) {
			array[i] = sc.nextInt();
			
			if(array[i] % 2 != 0) {
				ans = 0;
			}
			
			while(array[i] % 2 == 0) {
				array[i] = array[i] / 2;
				count++;
			}
			
			if(count > 0) {
				ans = count;
			} else {
				Math.min(ans, count);
			}
		}
		System.out.println(ans);
	}
}