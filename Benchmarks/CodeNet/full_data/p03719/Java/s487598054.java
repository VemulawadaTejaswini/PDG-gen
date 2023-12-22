import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] lines = sc.next().split(" ");
        int n = Integer.parseInt(lines[1]);
        lines = sc.next().split(" ");
        int sum = Integer.parseInt(lines[1]);
        String result = lines[0];
        while (n > sum && sc.hasNext()) {
            lines = sc.next().split(" ");
            sum += Integer.parseInt(lines[1]);
            result = lines[0];
        }
        System.out.println(result);
    }
}
