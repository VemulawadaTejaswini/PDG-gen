import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		long count = 0; long subcount = 1;
		String[] S = new String[n];
		String s = "0"; String[] s2 = new String[10];
 		for(int i = 0; i < n; i++) {
			s = sc.next();
			for(int j = 0; j < 10; j++)
				s2[j] = s.substring(j,j+1);
		Arrays.sort(s2);
		S[i] = Arrays.toString(s2);
		}
 		Arrays.sort(S);
 		for(int i = 0; i < n-1; i++) {
 			if(S[i].equals(S[i+1])) {
 				subcount++;
 				if(i == n-2) count += subcount*(subcount-1)/2;
 			} else {
 				count += subcount*(subcount-1)/2;
 				subcount = 1;
 			}
 		}
 		System.out.println(count);
	}

}