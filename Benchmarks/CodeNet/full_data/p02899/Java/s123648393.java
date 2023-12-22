import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = i+1;
        }
        Arrays.sort(a, (x, y) -> x[0] - y[0]);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(a[i][1] + " ");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
        sc.close();

    }

}
