import java.util.*;

public class Main {
	public static void main(String[] orgs) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int N = sc.nextInt();

		if(D == 0&&N ==100){
			System.out.println(100);
		}else{
			System.out.print(N * Math.pow(100,D));
		}
	}
}