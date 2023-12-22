import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String S = sc.nextLine();
		int result = 9999;
		int temp;
		for(int i=0; i<S.length()-2;i++){
			temp = Math.abs(Integer.parseInt(S.substring(i, i+3))-753);
			if(temp < result){
				result = temp;
			}
		}
		System.out.println(result);
		sc.close();
	}

}