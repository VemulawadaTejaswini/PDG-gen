import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		int count_1 = 0;
		for (int i=0; i<S.length(); i++){
			if (i%2 == 0){
				if (S.charAt(i) == '0'){
					count_1 += 1;
				}
			}else if (i%2 == 1){
				if (S.charAt(i) == '1'){
					count_1 += 1;
				}
			}
		}

		int count_2 = 0;
		for (int i=0; i<S.length(); i++){
			if (i%2 == 0){
				if (S.charAt(i) == '1'){
					count_2 += 1;
				}
			}else if (i%2 == 1){
				if (S.charAt(i) == '0'){
					count_2 += 1;
				}
			}
		}

		System.out.println(Math.min(count_1, count_2));
	}
}