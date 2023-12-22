import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		String s=sc.next();
		int size=s.length();
		
		if(s.substring(0,n/2).equals(s.substring(size/2))){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		sc.close();
	}

}