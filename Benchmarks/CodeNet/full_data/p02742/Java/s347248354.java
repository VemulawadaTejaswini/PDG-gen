import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long numberH = sc.nextInt();
		long numberW = sc.nextInt();
		sc.close();
/*
		int yokomasu = 0;
		if(numberW % 2 == 0) {
			yokomasu = numberW/2;
		}else {
			yokomasu = (numberW+1)/2;
		}

		int answer = 0;

		for(int i = 1; i <= numberH; i++) {
			if(i % 2 ==1) {
				answer+=yokomasu;
			}else {
				answer+=(yokomasu - 1);
			}
		}
*/
		long answer = 0;
		if(numberW != 1 || numberH != 1) {
			if(numberH % 2 ==1) {
				answer = (numberH * numberW +1) /2 ;
			}else {
				answer = (numberH * numberW)/2;
			}
		}else{
			answer =1;
		}
		System.out.println(answer);
	}

}
