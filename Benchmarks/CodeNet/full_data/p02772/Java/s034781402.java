import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        boolean isOk = true;
        for(int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
            if(A[i]  % 2 == 0) {
                if(!(A[i] % 6 == 0 || A[i] % 10 == 0)) {
                    isOk = false;
                }
            }
        }
        if(isOk){
            System.out.println("APPROVED");
        }else{
            System.out.println("DENIED");
        }
        return;
    }
}
