import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char[] ch = s.toCharArray();
        String[] result = new String[ch.length];
        for (int i = 0; i < s.length(); i++) {
            result[i] = String.valueOf((char) ((ch[i] - 'A' + n) % 26 + 'A'));
        }
        System.out.println(String.join("", result));
    }

}

