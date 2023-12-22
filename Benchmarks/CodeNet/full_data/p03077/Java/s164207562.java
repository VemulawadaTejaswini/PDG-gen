import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();
        long E = sc.nextLong();

        long[] number = new long[6];
        number[0] = N;
        long time = 0;
        while (true) {
            for (int i = 5; i >= 0; i--) {
                if (number[i] == 0) {
                    continue;
                }
                if (i == 5) {
                    continue;
                }
                else if (i == 4) {
                    tranfer(number, i, E);
                }
                else if (i == 3) {
                    tranfer(number, i, D);
                }
                else if (i == 2) {
                    tranfer(number, i, C);
                }
                else if (i == 1) {
                    tranfer(number, i, B);
                }
                else { // i == 0
                    tranfer(number, i, A);
                }
            }

            time++;
            if (number[5] == N) {
                break;
            }
            //time++;

        }

        System.out.print(time);
    }

    static void tranfer(long[] number, int i, long transferMax) {
        if (number[i] <= transferMax) {
            number[i+1] += number[i];
            number[i] = 0;
        }
        else {
            number[i+1] += transferMax;
            number[i] -= transferMax;
        }
    }
}
