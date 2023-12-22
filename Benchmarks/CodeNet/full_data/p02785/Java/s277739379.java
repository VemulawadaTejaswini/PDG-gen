import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int monster = sc.nextInt();
		int teck = sc.nextInt();

		Integer[] HP = new Integer[monster];
		int[] anser = new int[monster];
		long count = 0;
		for(int i = 0; i <monster; i++) {
			HP[i] = sc.nextInt();
		}
		//降順に並び替え
		Arrays.sort(HP, Collections.reverseOrder());
//		一番多いHPの持つモンスターに必殺技を与える。
//		それ以外はHP-1を行う
		for(int i = 0 ; i<HP.length; i++) {
			if(teck > 0) {
				HP[i] = 0;
				teck -= 1;
			}else {
				count += HP[i];
				HP[i] = 0;
			}
		}
		System.out.println(count);
	}
}
