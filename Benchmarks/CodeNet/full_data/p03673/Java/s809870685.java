import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Scanner scan = new Scanner(System.in);
		String ans = "";
		for (int i = 0; i < n-1; i++) {
			if(i % 2 == 0){
				ans = ans + scan.next();
			}else{
				ans = scan.next() + ans;
			}
		}
		ans = scan.next() + ans;
		System.out.println(ans);
		s.close();
		scan.close();

	}

}
