import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.next().split("").length;

        String result = "";
        for (int i = 0; i < count; i++) result += 'x';
        System.out.println(result);
    }
}