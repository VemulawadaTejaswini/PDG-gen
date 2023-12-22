import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        String s = stdin.nextLine();
        int count = 0;

        for (int i = 0; i < 3; i++) {
            if (s.charAt(i) == '1')
                count++;
        }

        System.out.println(count);
    }
}
