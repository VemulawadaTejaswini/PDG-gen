import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		if((a + b) % 2 == 0){
			System.out.println((a+b/2));
		}else{
			System.out.println((a+b/2)+1);
		}
	}
}