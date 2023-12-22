import java.util.Scanner;

class Main {
    void solve() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt(), k = in.nextInt();

        if(n%k == 0 || m %k == 0) {
            System.out.println("Yes");
        }else if(n > k && m > k){
            System.out.println("No");
        }else {
            int d = Math.abs(n - m);
            int a = n%k;
            int b = m%k;
            if(a%d == 0 || b%d==0) {
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }

    public static void main(String[] args) {
        new Main().solve();
    }
}
