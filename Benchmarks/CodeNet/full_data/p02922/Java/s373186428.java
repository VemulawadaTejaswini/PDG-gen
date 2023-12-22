import java.util.*;

/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int A = sc.nextInt();
		int B = sc.nextInt();
		if(B%((A-1)+1)==0){
			System.out.println(B/((A-1)+1));
		}else{
			System.out.println(B/((A-1)+1)+1);
		}
		sc.close();
	}
};
