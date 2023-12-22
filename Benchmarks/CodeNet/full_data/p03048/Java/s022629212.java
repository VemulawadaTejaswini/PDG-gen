import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int count = 0;
        int num;
        for (int i = 0; i * r <= n; i++) {
            for (int j = 0; j * g <= n; j++) {
                for (int k = 0; k * b <= n; k++) {
                    num = i * r + j * g + k * b;
                    if (num == n) {
                        count++;
                    }
                    if(check(num, n)){
                        break;
                    }
                }
            }
        }

        System.out.println(count);
    }

    static boolean check(int all, int n) {
        if (all == n) {
            return true;
        }
        return false;
    }

}
