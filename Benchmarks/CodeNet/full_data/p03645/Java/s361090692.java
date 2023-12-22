import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt(), m = in.nextInt();
        int[] a = new int[m], b = new int[m];
        for(int i = 0; i < m; i++) {
            a[i] = in.nextInt();
            b[i] = in.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            if(a[i] == 1) {
                list.add(b[i]);
            }
        }
        for(int i : list) {
            for(int j = 0; j < m; j++) {
                if(a[j] == i && b[j] == n) {
                    System.out.println("POSSIBLE");
                    return;
                }
            }
        }
        System.out.println("IMPOSSIBLE");
    }
}