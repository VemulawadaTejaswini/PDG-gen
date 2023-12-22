import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n];
        int[][] bc = new int[m][2];
        long sum = 0;

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        Arrays.sort(a);
        for (int i = 0; i < m; i++) {
            bc[i][0] = scanner.nextInt();
            bc[i][1] = scanner.nextInt();
        }

        Arrays.sort(bc, (t, b) -> Integer.compare(t[1], b[1]));

        int k = 0;
        for (int i = m-1; i >= 0; i--) {
            if(a[k] >= bc[i][1]){
                break;
            }
            for (int j = 0; j < bc[i][0]; j++) {
                if (a[k] < bc[i][1]) {
               
                    a[k++] = bc[i][1];
                } else {
                    break;
                }
            }
        }
        for(int i = 0 ; i < n ; i++){
            sum+=a[i];
        }
        System.out.println(sum);
    }

}
