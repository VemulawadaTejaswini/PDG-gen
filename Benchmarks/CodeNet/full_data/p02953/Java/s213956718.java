import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] H = new int[N];
        for(int i = 0; i < N; i++) {
            H[i] = scanner.nextInt();
        }
        if(N==1){
            System.out.println("Yes");
            return;
        }

        for(int i = N-1; i > 0; i--) {
            if(H[i] == H[i-1]){
                continue;
            }else if(H[i] > H[i-1]){
                continue;
            }else if(H[i] + 1 == H[i-1]){
                H[i-1]--;
            }else{
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
