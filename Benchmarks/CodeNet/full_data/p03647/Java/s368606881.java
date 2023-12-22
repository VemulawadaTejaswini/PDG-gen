import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> listn = new ArrayList<>();

        for (Integer i=0; i<m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == 1) {
                list1.add(b);
            }
            if (b == 1) {
                list1.add(a);
            }
            if (a == n) {
                listn.add(b);
            }
            if (b == n) {
                listn.add(a);
            }            
        }

        for (Integer med : list1) {
            if (listn.contains(med)) {
                System.out.println("POSSIBLE");
                return;
            }
        }
        System.out.println("IMPOSSIBLE");
    }
}
