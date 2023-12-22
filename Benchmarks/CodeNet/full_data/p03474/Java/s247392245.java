import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		boolean flag=true;
		String s=sc.next();

		for(int i=0;i<a+b+1;i++) {
			if((i!=(a))&&!('0' <= s.charAt(i) && s.charAt(i) <= '9'))	flag=false;
		}
		if(!(s.charAt(a)=='-'))flag=false;
		
		if(flag)		System.out.println("Yes");
		else		System.out.println("No");
		
	}
}