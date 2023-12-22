import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 357, 375, 537, 573, 735, 753
        // 3357, 3375, 3537, 3557, 3573, 3575, 3577

        long N = scanner.nextInt();
        long num = 357;
        int count = 0;
        while (num <= N) {
            if (is753(String.valueOf(num))) {
                count++;
            }
            num = Long.valueOf(next753(String.valueOf(num)));
        }

        System.out.println(count);
    }

    static String next753(String s) {
        char[] array = s.toCharArray();
        int index = array.length - 1;
        while (true) {
            char c = array[index];
            if (c == '3') {
                array[index] = '5';
                break;
            } else if (c == '5') {
                array[index] = '7';
                break;
            } else {
                array[index] = '3';
                index--;
                if (index == -1) {
                    return "3" + String.valueOf(array);
                }
            }
        }
        return String.valueOf(array);
    }

    static boolean is753(String s) {
        return s.indexOf('3') != -1
                && s.indexOf('5') != -1
                && s.indexOf('7') != -1;
    }

}
