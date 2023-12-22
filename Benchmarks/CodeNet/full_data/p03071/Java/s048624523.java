import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = Math.max(a,b);
		System.out.println(Math.max(2*c-1,a+b));
  }
}
