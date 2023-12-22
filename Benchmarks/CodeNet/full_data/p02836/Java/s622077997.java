import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] charArray = sc.next().toCharArray();
        int cnt = 0;

        for (int i = 0; i < charArray.length / 2; i++) {
            if (charArray[i] != charArray[charArray.length - 1 - i]) cnt++;
        }

        System.out.println(cnt);
    }
}