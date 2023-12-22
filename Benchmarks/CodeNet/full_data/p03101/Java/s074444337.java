import java.util.*;

public class Main{
        public static void main(String[] args){
                Scanner scanner = new Scanner(System.in);
                int N = scanner.nextInt();
                int M = scanner.nextInt();
                int C = scanner.nextInt();
                int intArrayB[] = new int[M];
                int intArray[][] = new int[N][M];
                int sum = 0;
                int result = 0;

                for (int i = 0; i < M ; i++) {
                        intArrayB[i] = scanner.nextInt();
                }

                for (int i = 0; i < N ; i++) {
                        for (int j = 0; j < M ; j++) {
                                intArray[i][j] = scanner.nextInt();
                        }
                }

                for (int i = 0; i < N ; i++) {
                        for (int j = 0; j < M ; j++) {
                                sum += intArray[i][j]*intArrayB[j];
                        }
                        if(sum + C >0){
                                result++;
                                sum = 0;
                        }
                }
                System.out.println(result);
        }
}