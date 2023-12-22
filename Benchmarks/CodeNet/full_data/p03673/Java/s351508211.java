import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Scanner scan = new Scanner(System.in);
		String str = "";
		String ans = "";
		String temp = "";
		for(int i = 0;i < n; i++){
			str = str + scan.next();
		}
		for(int i = 0;i < str.length(); i++){
			ans = ans + str.charAt(i);
			for(int j = 1 ; j < ans.length()+1;j++){
				temp = temp + ans.charAt(ans.length()-j);

			}
			ans = temp.substring(0, temp.length());
			temp = "";
		}
		System.out.println(ans);
	}

}
