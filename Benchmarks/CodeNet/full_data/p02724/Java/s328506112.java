import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	Scanner scan =new Scanner(System.in);
	int kouka =scan.nextInt();
	int  fivehundreds =500;
	int five =5;

	int a=kouka/fivehundreds;
	int nokori =kouka-a*fivehundreds;
	int b=nokori/five;
	int c=1000*a+5*b;

	System.out.println(c);
	}

}
