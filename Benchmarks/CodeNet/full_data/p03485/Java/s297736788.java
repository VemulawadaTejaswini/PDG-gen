import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner vd = new Scanner(System.in);
		int a = vd.nextInt();
		int b = vd.nextInt();
		vd.close();
		int i = (a+b)/2;
		if((a+b)%2==1)System.out.println(i+1);
		else System.out.println(i);

	}

}
