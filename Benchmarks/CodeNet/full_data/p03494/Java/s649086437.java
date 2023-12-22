import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for (byte i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        byte cnt = 0;
        while (true) {
            if ((Arrays.stream(a).sum() & 0x00000001) != 1) {
                for (byte i = 0; i < n; i++) {
                    a[i] = a[i] >> 1;
                }
                cnt++;
            } else {
                break;
            }
        }
        System.out.println(cnt);
    }
}