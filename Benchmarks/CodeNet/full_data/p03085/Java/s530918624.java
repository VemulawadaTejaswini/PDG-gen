import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String b=sc.nextLine(), ans="";
		if(b.equals("A")) ans="T";
		if(b.equals("C")) ans="G";
		if(b.equals("G")) ans="C";
		if(b.equals("T")) ans="A";
		System.out.println(ans);
	}
}