import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();
		char[] sArray = s.toCharArray();
		int[] numOfW = new int[n];
		int[] numOfE = new int[n];
		//wの数配列作る
		numOfW[0] = 0;
		for(int i=1;i<n;i++) {
			if(sArray[i-1] == 'W') {
				numOfW[i] = numOfW[i-1]+1;
			} else {
				numOfW[i] = numOfW[i-1];
			}
		}

		//Eの数配列作る
		numOfE[n-1] = 0;
		for(int i= n-2;i>=0;i--) {
			if(sArray[i+1]=='E') {
				numOfE[i] = numOfE[i+1]+1;
			} else {
				numOfE[i] = numOfE[i+1];
			}
		}
		int min = n;
		for(int i=0;i<sArray.length;i++) {
			if(min > numOfW[i]+numOfE[i]) {
				min = numOfW[i]+numOfE[i];
			}
		}
		System.out.println(min);
	}
}