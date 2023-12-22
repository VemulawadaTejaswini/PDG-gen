import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int w = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        int cursor = 0;

        while (cursor < str.length()) {
            sb.append(str.charAt(cursor));
            cursor += w;
        }

        System.out.println(sb.toString());
    }
}