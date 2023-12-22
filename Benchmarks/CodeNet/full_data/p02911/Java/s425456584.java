import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] nkqArr = sc.nextLine().split(" ");
		int n = Integer.parseInt(nkqArr[0]);
		int k = Integer.parseInt(nkqArr[1]);
		int q = Integer.parseInt(nkqArr[2]);
		int[] answerTime = new int[n];
		for(int i = 0; i < q ; i++) {
			int answerPerson = sc.nextInt() -  1;
			answerTime[answerPerson] = answerTime[answerPerson] + 1;
		}
		
		for(int i = 0 ; i < n; i++) {
			if(k - (q - answerTime[i]) <= 0) {
				System.out.println("No");
			}else {
				System.out.println("Yes");
			}
		}
		
	}
}