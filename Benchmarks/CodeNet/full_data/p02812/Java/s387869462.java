import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		String s=sc.next();

		char[]c=s.toCharArray();
		 
		int a= 0;
		for(int i = 0; i <= n-3; i ++) {
			if(c[i]=='A'&&c[i+1]=='B'&&c[i+2]=='C') {
				a++;
			}
		}
 	    System.out.println(a);
	}	
}