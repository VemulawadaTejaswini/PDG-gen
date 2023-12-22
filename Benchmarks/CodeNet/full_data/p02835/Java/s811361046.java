import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int  a = sc.next();
		int  b = sc.next();
		int  c = sc.next();
		
		if ((a+b+c)>=22){
			System.out.print("bust");
		}else{
			System.out.print("win");
		}
	}
}