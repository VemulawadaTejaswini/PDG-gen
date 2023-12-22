import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.nextLine();
		String T = in.nextLine();
		String[] S_arr = S.split("");
		String[] T_arr = T.split("");
		int total = 0;
		for (int i = 0; i<3;i++) {
			if(S_arr[i].compareTo(T_arr[i]) == 0) {
				total++;
			}
		
		}
		System.out.println(total);

	}

}
