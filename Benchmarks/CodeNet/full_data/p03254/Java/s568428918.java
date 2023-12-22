import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = sc.nextInt();

        int a[] = new int[100];
        int n = 0;

        while (sc.hasNext()) {
            a[n] = sc.nextInt();
            n++;
        }

        for (int i = N; i >= 2; i--) {
            for (int j = 1; j < i; j++) {
                if (a[j - 1] > a[j]) {
                    int w = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = w;
                }
            }
        }

        int total = 0;

        for (int i = 0; i < N; i++){
            total = total + a[i];
            if (total > x){
                System.out.println(i-1);
                break;
            }
        }






    }
}





