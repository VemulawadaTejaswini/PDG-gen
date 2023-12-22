
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int num = sc.nextInt();
		StringBuilder sb = new StringBuilder(sc.next());
		char ch = sb.charAt(sc.nextInt()-1);

		for(int i=0;i<num;i++)
			if(sb.charAt(i) != ch)
				sb.setCharAt(i,'*');

		sc.close();
		System.out.println(sb.toString());
	}
}