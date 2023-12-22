import java.util.Scanner;

public class Main {

	public static void main(String[] arg) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int count = 0;
		for(int i = 0; i < s.length(); i++){
			for(int j = i+1; j <= s.length(); j++){
				if(Long.parseLong(s.substring(i, j)) % 2019 == 0){
					count++;
					System.out.println(s.substring(i, j));
				}
			}
		}
		System.out.println(count);
	}
}
