mport java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		int a=stdin.nextInt();
		int b=stdin.nextInt();

		String s;
//		String t="0";
//		String s_a=""+a;
//		String s_b=""+b;
		StringBuffer sb=new StringBuffer();
		sb.append(a);
		sb.append(b);
		s=sb.toString();
		int check=Integer.parseInt(s);
//		System.out.println(check);
		int flag=0;
		for(int i=1;i<1000;i++)
			if(check==i*i)
				flag=1;

		if(flag==1)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}