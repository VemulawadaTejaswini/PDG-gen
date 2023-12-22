import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double total = 0.0;
        int[] e = new int[N];
        for (int i = 0; i < N; i++) {
			e[i] = sc.nextInt();
		}
        Arrays.sort(e);
        double tmp = 0.0;
        for (int i = 0; i < N; i++) {
        	if (i == 0) {
        		tmp = e[i];
        	}
        	tmp = (e[i] + tmp)/2.0;
        }
        System.out.println(tmp);
    }
}