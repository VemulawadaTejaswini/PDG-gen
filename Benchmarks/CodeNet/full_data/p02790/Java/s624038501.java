import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char[] aArr = new char[b];
        Arrays.fill(aArr, (char)(a + '0'));
        char[] bArr = new char[a];
        Arrays.fill(bArr, (char)(b + '0'));
        if (a <= b) {
            System.out.println(aArr);
        } else {
            System.out.println(bArr);
        }
    }
}