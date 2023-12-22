import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String s=scan.next();
		int c=0;
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
			{
				c=1;
			}
		}
		if(c==1)System.out.println("Bad");
		else System.out.println("Good");

	}

}
