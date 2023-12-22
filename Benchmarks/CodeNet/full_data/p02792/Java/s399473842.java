import java.util.*;

public class Main {
    public static void main(String[] args) {

        solve_152_D();

        return;
    }

    private static void solve_152_D() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int matrix[][] = new int[10][10];
        int count = 0;

        for(int i=0; i<10; i++)
            for(int j=0; j<10; j++)
                matrix[i][j] = 0;


        for(int i=1; i<=N; i++){
            int left = mostleft(i);
            int right = i%10;
            matrix[left][right]++;
        }

        for(int i=1; i<=N; i++){
            int left = mostleft(i);
            int right = i%10;
            count += matrix[right][left];
        }

        System.out.println(count);
    }

    private static int mostleft(int x){
        int a = x;
        while( x>0 ){
            a = x;
            x = x/10;
        }
        return a;
    }
}