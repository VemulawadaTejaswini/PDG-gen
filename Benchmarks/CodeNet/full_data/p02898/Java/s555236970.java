import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] n = new int[a];
		int count = 0;

		for(int i = 0;i < a;i++){
			n[i] = sc.nextInt();
		}

		for(int j = 0;j < a;j++){
			if(n[j] >= b){
				count++;
			}
		}

		System.out.println(count);

	}

}
