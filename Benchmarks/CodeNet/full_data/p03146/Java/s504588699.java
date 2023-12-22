import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int count = 1;
        while (true) {
            if (s == 4)
                break;
            if (s % 2 == 0) {
                s /= 2;
                count++;
            } else {
                s = s * 3 + 1;
                count++;
            }
        }
        System.out.println(count + 3);
    }
}