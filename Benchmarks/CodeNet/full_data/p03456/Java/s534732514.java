import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		int a=stdin.nextInt();
		int b=stdin.nextInt();

		String s;
//		String t="0";
		String s_a=""+a;
		String s_b=""+b;
		StringBuffer sb=new StringBuffer();
		sb.append(s_a);
		sb.append(s_b);
		s=sb.toString();
		int check=Integer.parseInt(s);
		int flag=0;
		for(int i=1;i<=100;i++)
			if(check==i*i)
				flag=1;


		if(flag==1)
			System.out.println("Yes");
		else if(flag==0)
			System.out.println("No");

//		System.out.println(check);
	}

}