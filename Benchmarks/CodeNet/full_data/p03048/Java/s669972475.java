import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int G = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();

        int count = 0;

        int Rmax = N / R;
        for (int i = 0; i <= Rmax; i++) {

            int remR = N - (R * i);
            int Gmax = remR / G;

            for (int j = 0; j <= Gmax; j++) {
                int remG = remR - (G * j);
                if (remG % B == 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
