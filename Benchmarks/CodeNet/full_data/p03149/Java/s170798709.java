import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Integer N[] = new Integer[4];
		for(int i = 0; i < 4; i++) {
			N[i] = sc.nextInt();
		}
		
		if(Arrays.asList(N).contains(1) && Arrays.asList(N).contains(7) && Arrays.asList(N).contains(9) && Arrays.asList(N).contains(4)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
