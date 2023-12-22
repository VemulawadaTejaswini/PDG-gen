
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		int  a=stdin.nextInt();
		int  b=stdin.nextInt();
		String s=stdin.next();
		char c[]=s.toCharArray();
		int flag=0;
//		for(int i=0;i<c.length;i++)
//			System.out.println(c[i]);

		if(a>5 || b>5){
			//			System.out.println("No");
			flag=1;
		}
		if(c[a]!='-' || c.length!=a+b+1){
			//			System.out.println("No");
			flag=1;
		}
		for(int i=0;i<a;i++){
			if(c[i]=='-')
				flag=1;
		}
		for(int i=a+1;i<a+b+1;i++){
			if(c[i]=='-')
				flag=1;
		}


		if(flag==1)
			System.out.println("No");
		else if(flag!=1)
			System.out.println("Yes");
	}
}