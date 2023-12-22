import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ



		Scanner sc = new Scanner(System.in);

		sc.nextInt();
		sc.nextLine();
		String inputStr = sc.next();


		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		int cnt4 = 0;


		for(int i = 0 ; i < inputStr.length() ; i++) {

			if(inputStr.charAt(i) == '.') {
				cnt1 += 1;
			}else if(inputStr.charAt(i) == '#') {
				cnt2 += 1;
			}

		}


		if(cnt1 < cnt2) {

			if(inputStr.charAt(0) == '.') {
				cnt1 -= 1;
			}

		}else if(cnt1 > cnt2) {

			if(inputStr.charAt(inputStr.length()-1) == '#') {
				cnt2 -= 1;
			}

		}else if(cnt1 == cnt2) {

			if(inputStr.charAt(inputStr.length()-1) == '#' || inputStr.charAt(0) == '.') {
				cnt2 -= 1;
			}

		}


		int min1 = Math.min(cnt1, cnt2);
		int min2 = 0;


		int right = 0;
		int left = inputStr.length()-1;

		while(inputStr.charAt(right) == '.') {
			right += 1;
		}
		while(inputStr.charAt(left) == '#') {
			left -= 1;
		}


		if(left < right) {
			min2 = 0;
		}else if(right < left) {

			for(int w = right ; w <= left ; w++) {

				if(inputStr.charAt(w) == '.') {
					cnt3 += 1;
				}else if(inputStr.charAt(w) == '#') {
					cnt4 += 1;
				}



			}

			min2 = Math.min(cnt3, cnt4);

		}



		System.out.println(Math.min(min1, min2));
		sc.close();

	}



}