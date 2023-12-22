import java.util.Scanner;

public class Main {
	public void syllables(int A,int B,int C) {
		if((A<0||A>10)||(B<0||B>10)||(C<0||C>10)) {
			System.exit(0);
		}else {
			switch(A) {
			case 5:
				if((B==5&&C==7)||(B==7&&C==5)) {
					System.out.println("Yes");
				}else {
					System.out.println("No");
				}
				break;
			case 7:
				if(B==5&&C==5) {
					System.out.println("Yes");
				}else {
					System.out.println("No");
				}
				break;
				default:
					System.out.println("No");
					break;
			}
		}
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
	        System.out.println("输入");
	        int A=sc.nextInt();
	        int B=sc.nextInt();
		int C=sc.nextInt();
		new Main().syllables(A,B,C);
		
	}

}