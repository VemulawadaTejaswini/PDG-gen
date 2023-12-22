import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		boolean a=false;
		
		if(A>8 || B>8){
			a=true;
		}
		
		if(a){
			System.out.println("Yay!");
		}else{
			System.out.println(":(");
		}
	}
}