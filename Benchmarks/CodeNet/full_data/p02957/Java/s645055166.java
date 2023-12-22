import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a=scan.nextLong();
		long b=scan.nextLong();
		if(a==0 && b%2!=0) System.out.println("IMPOSSIBLE");
		else 
		{
			int c1=1,c2=1;
			while(true)
			{
				long c=Math.abs(a-c1);
				long d=Math.abs(b-c2);
				if(c==d)
				{
					System.out.println(c1);
					break;
				}
				c1++;c2++;
			}
		}
	}

}
