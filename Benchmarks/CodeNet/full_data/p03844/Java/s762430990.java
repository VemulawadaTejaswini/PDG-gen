import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt();
		String op = sc.next();
		int B=sc.nextInt();//入力する順番はA　演算子　B
		
		int ans = A+B;
		if(op.equals("-")){
			ans = A+B;
		}
		System.out.println(ans);
	}	
}