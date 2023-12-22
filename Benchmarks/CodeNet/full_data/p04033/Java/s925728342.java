import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		long a=sc.nextLong(),b=sc.nextLong();
		if(a==0||b==0) {
			System.out.println("Zero");//Positive を、負ならば Negative を、Zero を出力せよ。
		}else if(a<0 && b>0){
			System.out.println("Zero");
		}else if(a>0&&b>0) {
			System.out.println("Positive");
		}else if((b-a)%2==0) {
			System.out.println("Negative");
		}else {
			System.out.println("Positive");
		}
	}
}
