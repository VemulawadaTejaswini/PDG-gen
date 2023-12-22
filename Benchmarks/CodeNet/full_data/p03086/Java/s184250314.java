import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] S = sc.next().toCharArray();

		int max = 0;
		int tmp = 0;
		for (int i=0; i<S.length; i++){
			if (S[i] == 'A' || S[i] == 'G' || S[i] == 'C' || S[i] == 'T'){
				tmp += 1;
			}else {
				tmp = 0;
			}
			if (tmp > max){
				max = tmp;
			}
		}
		System.out.println(max);
	}
}