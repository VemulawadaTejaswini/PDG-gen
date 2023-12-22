import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();
		String B = sc.nextLine();
		String [] aaa =A.split("",0);
		String [] bbb =B.split("",0);
		for(int i = 0;i<bbb.length;i++) {
			System.out.print(aaa[i]+""+bbb[i]);
		}
	}
}