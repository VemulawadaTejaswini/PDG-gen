import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean result = isBooleanAns(N);
		System.out.println(result == true ? "Yes" : "No");
	}
	public static boolean isBooleanAns(int n){
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(n == 4 * i + 7 * j){
					return true;
				}
			}
		}
	return false;
	}
}
