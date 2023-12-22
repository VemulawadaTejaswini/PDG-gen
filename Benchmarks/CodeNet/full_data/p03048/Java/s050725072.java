import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int count = 0;
        int num1,num2,num3;
       for (int i = 0; i * r <= n; i++) {
            num1 = i * r;
            if(check(num1, n)){
                count++;
                break;
            }
            for (int j = 0; num1 + j * g <= n; j++) {
                num2 = num1 + j * g;
                /*
                if(check(num2, n)){
                    count++;
                    break;
                }
                */
                for (int k = 0; num2 + k * b <= n; k++) {
                    num3 = num2 + k * b;
                    if (num3 == n) {
                        count++;
                    }
                    /*
                    if(check(num3, n)){
                        break;
                    }
                    */
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
