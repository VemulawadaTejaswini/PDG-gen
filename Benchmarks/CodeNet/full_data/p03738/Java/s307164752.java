import java.util.*;
public class Main {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new  Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int gal = a - b;
		if(gal>0) {
			System.out.println("GREATER");
		}else if(gal<0) {
			System.out.println("LESS");
		}else if(gal == 0) {
			System.out.println("EQUAL");
		}
	}
 
}