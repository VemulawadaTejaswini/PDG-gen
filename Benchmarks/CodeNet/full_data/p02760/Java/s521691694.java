import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner fsc = new Scanner(System.in);
        int[][] a = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = fsc.nextInt();
            }
        }
        int n = fsc.nextInt();
        for (int i = 0; i < n; i++) {
            int b = fsc.nextInt();
            for (int r = 0; r < 3; r++) {
                for (int c = 0; c < 3; c++) {
                    if (a[r][c] == b) {
                        a[r][c] = -1;
                    }
                }
            }
        }
        for(int i=0;i<3;i++){
            if(a[i][0]<0&&a[i][1]<0&&a[i][2]<0){
                System.out.println("Yes");
                return;
            }
            if(a[0][i]<0&&a[1][i]<0&&a[2][i]<0){
                System.out.println("Yes");
                return;
            }
        }
        if(a[0][0]<0&&a[1][1]<0&&a[2][2]<0){
            System.out.println("Yes");
            return;
        }
        if(a[0][2]<0&&a[1][1]<0&&a[2][0]<0){
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}
