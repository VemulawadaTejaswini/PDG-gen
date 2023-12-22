import java.util.*;
public class Main {
	public static void main(String[] args){
		// get numbers
		Scanner sc = new Scanner(System.in);        
        int N = sc.nextInt();
        int Q = sc.nextInt();
        String a = sc.next();
        int b[] = new int[Q*2];
        int ans = 0;

        for (int i = 0; i < Q*2; i++) {
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < Q; i++) {
            for(int j = 0; j < b[i*2+1] - b[i*2]; j++) {
                if (a.substring(b[i*2]+j-1, b[i*2]+j).equals("A") && a.substring(b[i*2]+j, b[i*2]+j+1).equals("C")) {
                    ans++;
                }
            }
            // output
            System.out.println(ans);
            ans = 0;
        }
        sc.close();
	}
}