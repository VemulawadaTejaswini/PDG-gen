import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();
		int cost = Math.abs(Math.max(math.max(a1,a2),a3) - Math.min(math.min(a1,a2),a3));

		System.out.println(cost);

	}
}