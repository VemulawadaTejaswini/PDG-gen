import java.util.Scanner;
public class Main{
	public static void main(String[]args) {
		int sum=0;
		Scanner input=new Scanner(System.in);
		int human=input.nextInt();
		for(int i=1;i<=human;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
	}
}