import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        char[] c = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N-i; j++) {
                System.out.print(c[0]);
            }
            for(int j = 0; j < i; j++) {
                System.out.print(c[j+1]);
            }
            System.out.println("");
        }
    }
}
