import java.util.Scanner;
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = sc.next();
		int left = 0;
		for (int i = 0; i < N; i++) {
			if(s.charAt(i) == '(') left++;
			else left--;
			if (left < 0) {
				s = "(" + s;
				N++;
				i++;
				left++;
			}
		}
		for (int i = left ; i > 0; i--) {
			s = s + ")";
		}
		System.out.println(s);
    }
}