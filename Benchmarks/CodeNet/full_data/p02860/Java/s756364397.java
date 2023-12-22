import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.nextLine();

		if(s.length() == 1){
			System.out.print("No");
			return;
		}

		String ss = s.substring(0,(n/2));
		String sss = s.substring((n/2)+1,n);

		if(ss.equals(sss)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}