import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next(); 
		String s = str1 + str2;
		int i = Integer.parseInt(s);
		for(int j = 1;j<1000;j++ ) {
			if(j*j==i) {
				System.out.println("yes");
				return;
				
			}
			
		}System.out.println("no");
		
	}

}
