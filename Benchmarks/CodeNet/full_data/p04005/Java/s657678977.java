import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] x = new int[3];
		for(int i=0; i<3; i++)
			x[i] = sc.nextInt();
		
		if(x[0]%2==0 || x[1]%2==0 || x[2]%2==0) {
			System.out.println(0);
		} else {
			Arrays.sort(x);
			System.out.println(x[0]*x[1]);
		}
		
		sc.close();
	}
}
