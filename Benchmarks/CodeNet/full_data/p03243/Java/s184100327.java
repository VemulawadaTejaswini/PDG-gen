import java.util.Scanner;

public class Main {
    static int N;
    static int THRESHOLD = 111;

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        scanner.close();

        for(int i = 1; i < 9; i++) {
            if(N >= THRESHOLD * i && N <= THRESHOLD * (i + 1)) {
                if(N == THRESHOLD * i) {
                    System.out.println(THRESHOLD * i);
                    break;
                } else {
                    System.out.println(THRESHOLD * (i + 1));
                    break;
                }
            }
        }
    }
}