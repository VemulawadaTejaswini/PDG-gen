import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int array[][] = new int [3][3];

        array[0][0] = sc.nextInt();
        array[0][1] = sc.nextInt();
        array[0][2] = sc.nextInt();
        array[1][0] = sc.nextInt();
        array[1][1] = sc.nextInt();
        array[1][2] = sc.nextInt();
        array[2][0] = sc.nextInt();
        array[2][1] = sc.nextInt();
        array[2][2] = sc.nextInt();

        int n = sc.nextInt();

        int num[] = new int [n];

        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < 3; i++) {
                for (int k = 0; k < 3; k++) {
                    if (array[i][k] == num[j]) {
                        array[i][k] = 1000;
                    }
                }
            }
         }

        for (int i = 0; i < 3; i++) {
           if (array[i][0] == 1000 && array[i][1] == 1000 && array[i][2] == 1000) {
               System.out.println("Yes");
               return;
           }

            if (array[0][i] == 1000 && array[1][i] == 1000 && array[2][i] == 1000) {
                System.out.println("Yes");
                return;
            }
        }

        if (array[0][0] == 1000 && array[1][1] == 1000 && array[2][2] == 1000) {
            System.out.println("Yes");
            return;
        }

        if (array[0][2] == 1000 && array[1][1] == 1000 && array[2][0] == 1000) {
            System.out.println("Yes");
            return;
        }

        System.out.println("No");

    }

}
