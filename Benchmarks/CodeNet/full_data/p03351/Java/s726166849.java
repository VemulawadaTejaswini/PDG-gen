import java.util.*;
public class Main{
	public static void main(String[] args){
		//abc
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();//制限
		//c-a<dこの時点でtrue
		//b-a<d&&c-a<dならtrue
		if((double)Math.abs(b - a) <= d && (double)Math.abs(c - b) <= d){
		System.out.println("Yes");
		}else if((double)Math.abs(c - a) <= d){
		System.out.println("Yes");
		}else{
		System.out.println("No");		
		}	
	}
}
