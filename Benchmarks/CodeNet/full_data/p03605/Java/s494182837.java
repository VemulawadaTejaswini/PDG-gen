import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = 0;
		String ch1;
		String ch2;

		// 整数の入力
		x = sc.nextInt();

		String st = new String();
		st = String.valueOf(x);

		ch1 = st.substring(0,1);
		ch2 = st.substring(1,2);

		if(ch1.equals("9") || ch2.equals("9")){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

		sc.close();
	}

}
