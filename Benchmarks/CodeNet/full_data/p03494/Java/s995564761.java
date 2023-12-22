import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] numberArray = new int[n];
		for(int i =0;i < n;i++) {
			numberArray[i] = sc.nextInt();
		}
		int answer =0;
		boolean continueFlg = true;
		while(continueFlg){
			for(int i = 0;i < n;i++) {
				if(numberArray[i] % 2 ==0) {
					numberArray[i] /= 2;
					if(i == n-1) {
						answer++;
					}
				}else {
					continueFlg = false;
					break;
				}
			}
		}
		System.out.println(answer);
	}
}