//2 | (B - A) →後手のターンで隣接
//              →先手は端へ
//              →後手勝ち
 
import java.util.*;

class Main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if( (B - A) % 2 == 0 ){
			System.out.println("Alice");
		}else{
			System.out.println("Borys");
		}
	}
}
