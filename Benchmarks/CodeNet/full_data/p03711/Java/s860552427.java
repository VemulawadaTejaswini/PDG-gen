import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		String ans = "No";

		if((1==x||3==x||5==x||7==x||8==x||10==x||12==x)&&(1==y||3==y||5==y||7==y||8==y||10==y||12==y)) {
			ans="Yes";
		}else if((4==x||6==x||9==x||11==x)&&(4==y||6==y||9==y||11==y)) {
			ans="Yes";
		}else if(2==x&&2==y) {
			ans="Yes";
		}
		System.out.println(ans);

	}

}