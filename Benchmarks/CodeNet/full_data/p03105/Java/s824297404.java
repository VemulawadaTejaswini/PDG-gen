import java.util.Scanner;public class Main{public static void main(String[]args){Scanner scan=new Scanner(System.in);
		//String str=scan.next();
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int ans=0;
		boolean bool=false;
		if(b/a>=c) {
			ans=c;
		}
		else {
			ans=b/a;
		}
		System.out.println(ans);
	}
}