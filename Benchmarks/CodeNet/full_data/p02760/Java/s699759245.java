import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[3][3];
        boolean[][] flag = new boolean[3][3];
        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                A[i][j] = sc.nextInt();
            }
        }
        int N = sc.nextInt();
        for (int i=0;i<N;i++) {
            int b = sc.nextInt();
            for (int j=0;j<3;j++) {
                for (int k=0;k<3;k++) {
                    if (A[j][k]==b) flag[j][k]=true;
                }
            }
        }

        boolean ans = false;
        if (flag[0][0] && flag[1][0] && flag[2][0]) ans=true;
        if (flag[0][1] && flag[1][1] && flag[2][1]) ans=true;
        if (flag[0][2] && flag[1][2] && flag[2][2]) ans=true;
        if (flag[0][0] && flag[0][1] && flag[0][2]) ans=true;
        if (flag[1][0] && flag[1][1] && flag[1][2]) ans=true;
        if (flag[2][0] && flag[2][1] && flag[2][2]) ans=true;
        if (flag[0][0] && flag[1][1] && flag[2][2]) ans=true;
        if (flag[2][0] && flag[1][1] && flag[0][2]) ans=true;

        if (ans) System.out.println("Yes");
        else System.out.println("No");
    }
}