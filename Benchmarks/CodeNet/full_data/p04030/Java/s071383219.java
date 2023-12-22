import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] s_char = s.toCharArray();

        char[] output = new char[10];
        int index = 0;
        for (char ch : s_char) {
            switch (ch) {
                case '0':
                case '1':
                    output[index++] = ch;
                    break;
                case 'B':
                    if (index == 0) continue;
                    index--;
            }
        }
        for (char ch : output) {
            System.out.print(ch);
        }
        System.out.print("\n");
    }
}