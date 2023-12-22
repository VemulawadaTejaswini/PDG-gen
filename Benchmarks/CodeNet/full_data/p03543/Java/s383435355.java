import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int n = sc.nextInt();
		String st = Integer.toString(n);

		String a = String.valueOf(st.charAt(0));
		String b = String.valueOf(st.charAt(1));
		String c = String.valueOf(st.charAt(2));
		String d = String.valueOf(st.charAt(3));

		if(a.equals(b) & b.equals(c)){
			System.out.println("Yes");
		}else if(b.equals(c) & c.equals(d)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

		sc.close();
	}

}
