import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        int x = kbd.nextInt();
        int count = 1;
        int d = 0;
        int i = 0;
        while (x >= d && i < n) {
            int temp = kbd.nextInt();
            if (temp + d > x) {
                break;
            } else {
                d = d + temp;
                count++;
                i++;
            }
        }
        System.out.println(count);
    }
}