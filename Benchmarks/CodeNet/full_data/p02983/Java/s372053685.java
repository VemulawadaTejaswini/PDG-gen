import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        int ans = 0;
        int min = Integer.MAX_VALUE;
        for(int i = L; i < R; i++){
            for(int j = i+1; j <= R; j++) {
                ans = (i * j) % 2019;
                if(min > ans) min = ans;
            }
        }

        System.out.println(min);
    }
}