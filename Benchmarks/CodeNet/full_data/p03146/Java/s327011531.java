import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        if(s % 2 == 0) {
            s /= 2;
        } else {
            s = s * 3 + 1;
        }
        int tmp = s;
        int ans = 2;
        while(true) {
            if(s % 2 == 0) {
                s /= 2;
            } else {
                s = s * 3 + 1;
            }
            ans++;
            if(s == tmp) {
                break;
            }
            if(s == 1) {
                ans++;
                break;
            }
        }
        System.out.println(ans);
    }
}