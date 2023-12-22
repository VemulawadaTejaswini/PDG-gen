import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s[]=sc.next().split(",");
			for(String i:s) {
				System.out.print(i+" ");
			}
	}

}
