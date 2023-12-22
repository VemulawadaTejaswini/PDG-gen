import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int ans = 0;
        if(A %2 == B %2) {
            ans = (Math.max(A, B) - Math.min(A, B)) /2;
        }else{
            // min length
            int min = Math.min(A-1, N-B);
            ans = min + 1 + ((Math.max(A, B) - Math.min(A, B)) /2);
        }

        System.out.println(ans);
    }
}