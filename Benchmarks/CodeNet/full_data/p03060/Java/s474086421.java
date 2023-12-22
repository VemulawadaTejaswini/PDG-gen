import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

        int jewels = sc.nextInt();
        int v[] = new int[jewels];
        int c[] = new int[jewels];
        for (int i = 0; i < jewels; i++) {
            v[i] = sc.nextInt();
        }
        for (int i = 0; i < jewels; i++) {
            c[i] = sc.nextInt();
        }

        int res = 0;
        for (int i = 0; i < jewels; i++) {
            if (v[i] - c[i] > 0) {
                res += v[i] - c[i] ;
            }
        }

		System.out.println(res);
	}
}