import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		boolean j = false;

if(A < C && B > C) {
	j= true;
}

if(A > C && B < C) {
	j = true;
}

if(j) {
	System.out.println("Yes");
}else {
	System.out.println("No");
}

	}

}
import java.util.Scanner;

public class tenkaB {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		boolean j = false;

if(A < C && B > C) {
	j= true;
}

if(A > C && B < C) {
	j = true;
}

if(j) {
	System.out.println("Yes");
}else {
	System.out.println("No");
}

	}

}
