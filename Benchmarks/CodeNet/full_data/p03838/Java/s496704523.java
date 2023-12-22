import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int signX = x > 0 ? 1 : (x < 0 ? -1 : 0);
        int signY = y > 0 ? 1 : (y < 0 ? -1 : 0);
        int answer;
        int diffAbs = Math.abs(Math.abs(y)-Math.abs(x));
        if (x > 0 && y > 0) {
            if (y > x) {
                answer = diffAbs;
            } else {
                answer = diffAbs + 2;
            }
        } else if (x < 0 && y < 0) {
            if (y > x) {
                answer = diffAbs;
            } else {
                answer = diffAbs + 2;
            }
        } else if (signX * signY < 1) {
            answer = diffAbs + 1;
        } else if (x == 0) {
            if (y < 0) {
                answer = diffAbs + 1;
            } else {
                answer = diffAbs;
            }
        } else {
            if (x > 0) {
                answer = diffAbs + 1;
            } else {
                answer = diffAbs;
            }
        }
        System.out.println(answer);
    }
}