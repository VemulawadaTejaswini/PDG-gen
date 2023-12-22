import java.util.Scanner;



public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S=sc.next();


		S=S.replace("dream", "");
		S=S.replace("dreamer","");
		S=S.replace("erase", "");
		S=S.replace("eraser","");

		if(S.length()==0) {
			System.out.println("YES");

		}else {
			System.out.println("NO");

		}


	}
}
