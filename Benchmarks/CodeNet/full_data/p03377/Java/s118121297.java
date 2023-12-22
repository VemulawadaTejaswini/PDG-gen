import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int X=sc.nextInt();
		int cat;
		int dog;
		if(a<1 || a>100){
			System.out.println("NO");
			return;
		}
		if(b<1 || b>100){
			System.out.println("NO");
			return;
		}
		if(X<a ||  X>=(a+b)){
			System.out.println("NO");
			return;
		}
		else{
			System.out.println("YES");
		}
	}
}