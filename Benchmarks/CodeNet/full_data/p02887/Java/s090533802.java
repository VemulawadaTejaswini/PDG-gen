import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); sc.nextLine();
        String s = sc.nextLine();
        int count = 0;
        char prevC = 0;
        for (int i = 0; i < N; i++) {
            char c = s.charAt(i);
            if (c != prevC) {
                count++;
                prevC = c;
            }
        }
        System.out.println(count);
    }
}
