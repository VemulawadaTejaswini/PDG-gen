import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC041A - Table Tennis Training

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int x = 0;
        int y = 0;
        
        if (a > b) {
            x = a;
            y = b;
        } else {
            x = b;
            y = a;
        }

        long cnt = 0;
        if ((x - y) % 2 == 0) {
            while(true) {
                if (x == y) {
                    break;
                } else {
                    cnt++;
                    x--;
                    y++;
                }
            }
        } else {
            int z = 1;
            if (n - x > y - 1) {
                z = -1;
            }
            while(true) {
                if (x == y) {
                    break;
                } else {
                    cnt++;
                    x += z;
                    y += z;
                    if (x < 1) {
                        x = 1;
                    } else if (x > n) {
                        x = n;
                    }
                    if (y < 1) {
                        y = 1;
                    } else if (y > n) {
                        y = n;
                    }
                }
            }
        }
        
        System.out.println(cnt);
    }
}