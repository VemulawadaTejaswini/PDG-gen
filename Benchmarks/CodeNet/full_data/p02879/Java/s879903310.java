import java.util.Scanner;
public class demo1 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if((a<10)&&(a>0)&&(b>0)&&(b<10)) {
			System.out.println(a*b);
		}
		else {
			System.out.println(-1);
		}
	}

}
