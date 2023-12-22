import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] array1 = new int[m];
        int[] array2 = new int[m];
        ArrayList<Integer> array3 = new ArrayList<Integer>();
        ArrayList<Integer> array4 = new ArrayList<Integer>();
        for (int i = 0; i < m; i++) {
            array1[i] = sc.nextInt();
            array2[i] = sc.nextInt();
            if (array1[i] == 1) {
                array3.add(array2[i]);
            }
            if (array2[i] == n) {
                array4.add(array1[i]);
            }
        }
        int ans = 0;
        for (int i = 0; i < array3.size(); i++) {
            for (int j = 0; j < array4.size(); j++) {
                if (array3.get(i) == array4.get(j)) {
                    ans = 1;
                }
            }
        }
        if (ans == 1) {
            System.out.println("POSSIBLE");
        } else {
            System.out.println("IMPOSSIBLE");
        }
    }
}
