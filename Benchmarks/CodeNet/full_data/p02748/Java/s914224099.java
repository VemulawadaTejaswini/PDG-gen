import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        int numM = sc.nextInt();
        int min;
        int a[] = new int[numA];
        int b[] = new int[numB];
        int m [][] = new int[numM][3];
        for (int i = 0; i < numA; i++){
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < numB; i++){
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < numM; i++){
         for (int j = 0; j < 3; j++){
             m[i][j] = sc.nextInt();
         }
        }
        min = a[0] + b[0];
        for (int i = 0; i < numA; i++){
            for (int j = 0; j < numB; j++){
                if (min > a[i] + b[j]){
                    min = a[i] + b[j];
                }
            }
        }
        for (int i = 0; i < numM; i++){
            if (min > a[m[i][0] - 1] + b[m[i][1] - 1] - m[i][2]){
                min = a[m[i][0] - 1] + b[m[i][1] - 1] - m[i][2];
            }
        }
        System.out.println(min);
    }
}
