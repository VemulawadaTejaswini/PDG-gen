import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] c = new int[3][3];
        int[] a = new int[3];
        int[] b = new int[3];
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                c[i][j] = Integer.parseInt(sc.next());
            }
        }
        String ans = "No";
        for(int i=0; i<=100; i++) {
            a[0] = i;
            b[0] = c[0][0] - i;
            b[1] = c[0][1] - i;
            b[2] = c[0][2] - i;
            a[1] = c[1][0] - b[0];
            a[2] = c[2][0] - b[0];
            if(c[1][1] == a[1]+b[1] && c[1][2] == a[1]+b[2] && c[2][1] == a[2]+b[1] && c[2][2] == a[2]+b[2]) {
                ans = "Yes";
                break;
            }
        }
        
        System.out.println(ans);
        
    }
}
