import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] aArr = new int[a];
        for (int i = 0; i < a; i++) {
            aArr[i] = - sc.nextInt();
        }
        Arrays.sort(aArr);
        int[] bArr = new int[b];
        for (int i = 0; i < b; i++) {
            bArr[i] = - sc.nextInt();
        }
        Arrays.sort(bArr);
        int[] cArr = new int[x + y + c];
        for (int i = 0; i < x; i++) {
            cArr[i] = aArr[i];
        }
        for (int i = 0; i < y; i++) {
            cArr[x + i] = bArr[i];
        }
        for (int i = 0; i < c; i++) {
            cArr[x + y + i] = - sc.nextInt();
        }
        Arrays.sort(cArr);
        long total = 0;
        for (int i = 0; i < x + y; i++) {
            total -= cArr[i];
        }
        System.out.println(total);
    }
}
