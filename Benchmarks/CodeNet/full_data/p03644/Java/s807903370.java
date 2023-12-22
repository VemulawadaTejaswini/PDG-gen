import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		int[] answers = {1,2,4,8,16,32,64,125};
		while(n >= answers[ans + 1]) {
			ans++;
		}
		System.out.println(answers[ans]);
	}

}