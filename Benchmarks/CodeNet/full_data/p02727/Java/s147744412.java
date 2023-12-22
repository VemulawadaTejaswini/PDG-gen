import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int[] red = new int[a];
		int[] green = new int[b];
		int[] neet = new int[c];
		for(int i =0;i < a;i++) {
			red[i] = sc.nextInt();
		}
		for(int i =0;i < b;i++) {
			green[i] = sc.nextInt();
		}
		for(int i =0;i < c;i++) {
			neet[i] = sc.nextInt();
		}
		Arrays.sort(red);
		Arrays.sort(green);
		Arrays.sort(neet);
		List<Integer> answerArray = new ArrayList<Integer>();
		int r = red.length-1;
		for(int i =0;i < x;i++) {
			answerArray.add(red[r]);
			r--;
		}
		int g = green.length-1;
		for(int i =x;i < x+y;i++) {
			answerArray.add(green[g]);
			g--;
		}
		int n = c-1;
		for(int i =x + y;i < x + y +c;i++) {
			answerArray.add(neet[n]);
			n--;
		}
		Collections.sort(answerArray);
		int answer = 0;
		int index = answerArray.size() -1;
		for(int i = 0; i < x +y;i++) {
			answer += answerArray.get(index);
			index--;
		}
		System.out.println(answer);

	}
}