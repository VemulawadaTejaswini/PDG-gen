import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] array = new char[str.length()];
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(0) == '1') {
                if (i % 2 == 0) {
                    array[i] = '1';
                } else {
                    array[i] = '0';
                }
            } else {
                if (i % 2 == 0) {
                    array[i] = '0';
                } else {
                    array[i] = '1';
                }
            }
            if (str.charAt(i) != array[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}