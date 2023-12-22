import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[3];
        for (int i = 0; i < 3; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i] < array[j]) {
                    int a = array[i];
                    array[i] = array[j];
                    array[j] = a;
                }
            }
        }
        int a = array[0];
        int b = array[1];
        int c = array[2];
        int ans = 0;
        while (true) {
            if (a == b && b == c) {
                System.out.println(ans);
                break;
            } else if (a < b && b < c) {
                a++;
                b++;
                ans++;
            } else if (b == c) {
                if (a < b) {
                    a = a + 2;
                    ans++;
                } else {
                    b++;
                    c++;
                    ans++;
                }
            } else if (a == c) {
                if (b < a) {
                    b = b + 2;
                    ans++;
                } else {
                    a++;
                    c++;
                    ans++;
                }
            } else if (a == b) {
                if (c < a) {
                    c = c + 2;
                    ans++;
                } else {
                    a++;
                    b++;
                    ans++;
                }
            } else if (b < a && c < a) {
                b++;
                c++;
                ans++;
            } else if (a < b && c < b) {
                a++;
                b++;
                ans++;
            }
        }
        
    }
}
