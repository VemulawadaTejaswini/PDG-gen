import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
        int num = 100*a + 10*b + c;
		System.out.println((num%4 > 0)?"N0":"YES");
	}
}