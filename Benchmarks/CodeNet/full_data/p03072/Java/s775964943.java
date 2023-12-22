import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.nextLine());
        int[] M = new int[A];
        int max = 0;
        int cnt = 0;
        for (int i =0;i< A;i++) {
            M[i] = sc.nextInt();
            if(M[i] >=max) {
                cnt++;
            }
            max = Math.max(max,M[i]);
        }
        System.out.println(cnt);
    }
}
