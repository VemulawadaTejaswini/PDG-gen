import java.util.*;

class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String ans = "Yes";

		if(N <= 3) ans="No";

		if ((N%4 == 0) || (N%7 == 0) || (N%4 == 3) || (N%7 ==4)){
		} else{
			ans = "No";
		}
			System.out.println(ans);

	}
}