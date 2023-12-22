import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

/*


*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();
        List<Integer> C = new ArrayList<>();       

        for (int i = 0; i < a; i ++) {
            A.add(sc.nextInt());
        }
        for (int i = 0; i < b; i ++) {
            B.add(sc.nextInt());
        }
        for (int i = 0; i < c; i ++) {
            C.add( sc.nextInt());
        }

        Collections.sort(A,Collections.reverseOrder());
        Collections.sort(B,Collections.reverseOrder());

        for (int i= 0; i < x; i++) {
            C.add(A.get(i));
        }
        for (int i= 0; i < y; i++) {
        	C.add(B.get(i));
        }

        long ans = 0;
        Collections.sort(C,Collections.reverseOrder());

        for (int i = 0; i < x + y; i++) {
            ans += C.get(i);
        }
        System.out.println(ans);
    }
}
