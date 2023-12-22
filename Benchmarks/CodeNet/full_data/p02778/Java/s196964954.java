import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        String s = std.next();
        StringBuilder sb = new StringBuilder();
        sb.append("x".repeat(s.length()));
        System.out.println(sb.toString());
    }
}