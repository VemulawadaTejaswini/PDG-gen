import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int max = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int answer = 0;
		for(int i = 1 ; i <= max ; i++ ) {
			String num = String.valueOf(i);
			String[] numArray = num.split("");
			//int[] keta = new int[numArray.length];
			int total = 0;
			for (int j = 0; j < numArray.length; j++) {
				total += Integer.parseInt(numArray[j]);
			}
			if(total >= a && total <= b) {
				answer += i;
			}

		}
		System.out.println(answer);

	}

}
