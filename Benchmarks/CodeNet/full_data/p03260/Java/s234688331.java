import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner keyboardScanner=new Scanner(System.in);
		int a=keyboardScanner.nextInt();
		int b=keyboardScanner.nextInt();
		if((a*b)%2==0) {System.out.println("No");
	}else {System.out.println("Yes");}
}
}