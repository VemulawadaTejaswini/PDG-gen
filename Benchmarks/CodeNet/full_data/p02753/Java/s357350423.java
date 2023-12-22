import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	
	void run() {
		Scanner sc=new Scanner(System.in);
		char[] cs=sc.next().toCharArray();
		boolean ans=cs[0]==cs[1]&&cs[1]==cs[2]&&cs[2]==cs[0];
		System.out.println(!ans?"Yes":"No");
	}
	
	void tr(Object...objects) {System.out.println(Arrays.deepToString(objects));}
}
