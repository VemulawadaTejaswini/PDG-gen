import java.util.*;
public class Main {
    public static void main(String[] args) {
        //data input
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }

        //sort
        Arrays.sort(list);

        //search
        long ct = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int a = list[i];
                    int b = list[j];
                    int c = list[k];
                    if (a < b + c && b < a + c && c < a + b) {
                        ct++;
                    } else {
                        break;
                    }
                }
            }// 1 2 3 4 5
        }

        System.out.println(ct);

    }
}