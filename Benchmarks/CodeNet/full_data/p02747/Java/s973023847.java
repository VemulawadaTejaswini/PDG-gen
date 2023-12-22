import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = "hi";
		boolean f = false;
		for(int i = 0 ; i < 10 ; ++i){
			if(S.equals(T)){
				f = true;
			}
			T += "hi";			
		}
		if(f){
			System.out.println("Yes");
		}else{
			System.out.println("No");			
		}
	}
}
