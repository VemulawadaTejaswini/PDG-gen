import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            if(a[i] == 1) {
                list.add(b[i]);
            }
            if(b[i] == n) {
                list2.add(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            int tmp = list.get(i);
            for (int j = 0; j < list2.size(); j++) {
                if(tmp == a[list2.get(j)]) {
                    System.out.println("POSSIBLE");
                    return;
                }
            }

        }
        System.out.println("IMPOSSIBLE");
    }
}