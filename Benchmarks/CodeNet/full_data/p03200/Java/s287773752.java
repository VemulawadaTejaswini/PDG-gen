import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.next();
        String[] input = in.split("");
        int count = 0;
        boolean changed = true;
        while (changed) {
            changed = false;
            for (int i = 0; i < input.length - 1; i++) {
                if ("B".equals(input[i]) && "W".equals(input[i + 1])) {
                    input[i] = "W";
                    input[i + 1] = "B";
                    count++;
                    changed = true;
                }
            }
        }
        System.out.println(count);
    }
}
