import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    class Student implements Comparable<Student>{
        long A, X;

        Student(long A, long X){
            this.A = A;
            this.X = X;
        }

        @Override
        public int compareTo(Student o) {
            return (int)(o.A - A);
        }
    }

    public Main() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        Student[] A = new Student[N];
        for (int i = 0; i < N; i++) {
            A[i] =  new Student(scanner.nextLong(), i);
        }

        Arrays.sort(A);

        long dp[][] = new long[N+1][N+1];
        dp[0][0] = 0;

        for (int i = 0; i < N; i++) {

            for (int left = 0; left <= i; left++) {
                int right = i-left;

                if (dp[i+1][left+1] < dp[i][left] + (A[i].X - left) * A[i].A){
                    dp[i+1][left+1] = dp[i][left] + (A[i].X - left) * A[i].A;
                }
                if (dp[i+1][left] < dp[i][left] + ( (N-right-1) - A[i].X) * A[i].A){
                    dp[i+1][left] = dp[i][left] + ( (N-right-1) - A[i].X) * A[i].A;
                }
            }
        }

        long Ans = 0;
        for (int i = 0; i < N+1; i++) {
            Ans = Math.max(Ans, dp[N][i]);
        }

        System.out.println(Ans);
    }

    public static void main(String[] args){
        new Main();
    }
}
