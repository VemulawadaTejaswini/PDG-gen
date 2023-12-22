import java.util.*;
public class Main {
	public static void main(String[] args){
    //データ取り込み
		Scanner sc = new Scanner(System.in);
		//String S = sc.next();
    //int B = sc.nextInt();
    //System.out.println();
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		if(A%2==1 && B%2==1){
				System.out.println("Odd");
		}else{
			System.out.println("Even");
		}
		
	}
}