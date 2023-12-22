import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        new Main().run();
    }
    int[] p;

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        p = new int[n];
        for(int i = 0; i < n; i++){
            p[i] = scanner.nextInt();
        }
        int ans = 0;
        for(int i = 1; i < n-1; i++) {
            ans += check(i);
        }
        System.out.println(ans);
    }

    private int check(int i) {
        if((p[i-1] < p[i] && p[i] < p[i+1]) || (p[i+1] < p[i] && p[i] < p[i-1])) {
            return 1;
        }
        return 0;
    }
}