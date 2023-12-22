import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] n=sc.next().split("");

		for(int i=0;i<3;i++) {
			System.out.print(Integer.valueOf(n[i])==1?"9":"1");
		}
	}
}