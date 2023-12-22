import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int result  = 0;
			for(int i = N; i > 0; i--){
				if(Check(i)){
					result = i;
					break;
				}
			}
			System.out.println(result);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	private static boolean Check(int n){
		while(n%2 == 0){
			n = n/2;
		}
		if(n == 1)return true;
		return false;
	}
}