import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		 
        String N = sc.next();
 
        if (N.charAt(0) == '7' || N.charAt(1) == '7' || N.charAt(2) == '7') {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

	}

}
