import java.util.Scanner;
public class Main {
public static void main(String[]srgs) {
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	int c=scan.nextInt();
	int ans=1145148101;
	for(int i=0;i<=a;i++) {
		if(ans>Math.abs(b*c*i-b*c*(a-i))){
			ans=Math.abs(b*c*i-b*c*(a-i));
		}
	}for(int i=0;i<=b;i++) {
		if(ans>Math.abs(a*c*i-a*c*(b-i))) {
			ans=Math.abs(a*c*i-a*c*(b-i));
		}
	}for(int i=0;i<=c;i++) {
		if(ans>Math.abs(b*a*i-b*a*(c-i))) {
			ans=Math.abs(b*a*i-b*a*(c-i));
		}
	}
	System.out.println(ans);
	}
}
