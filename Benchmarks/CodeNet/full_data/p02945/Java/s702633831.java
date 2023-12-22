import java.util.*;
class Main {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int x = A+B;
		int y = A-B;
		int z = A*B;
		if(x>=y && x>=z) {
			System.out.println(x);
		}else if(y>=x && y>=z) {
			System.out.println(y);
		}else {
			System.out.println(z);
		}
	}
}