import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int r = sc.nextInt();;
        int s = sc.nextInt();;
        int p = sc.nextInt();;
        String t = sc.next();
        char[] charT = t.toCharArray();

        long result = 0;
        for (int i = 0; i < charT.length; i++) {
            switch (charT[i]) {
                case 'r':
                    if (i >= k) {
                        if (charT[i - k] != 'r') {
                            result += p;
                        } else {
                            charT[i] = 's';
                        }
                    } else {
                        result += p;
                    }
                    break;
                case 's':
                    if (i >= k) {
                        if (charT[i - k] != 's') {
                            result += r;
                        } else {
                            charT[i] = 'p';
                        }
                    } else {
                        result += r;
                    }
                    break;
                case 'p':
                    if (i >= k) {
                        if (charT[i - k] != 'p') {
                            result += s;
                        } else {
                            charT[i] = 's';
                        }
                    } else {
                        result += s;
                    }
                    break;
            }
        }
        System.out.println(result);

    }
}
