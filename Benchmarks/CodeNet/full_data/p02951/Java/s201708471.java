import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr[] = scanner.nextLine().split(" ");
        int a = Integer.valueOf(inputStr[0]);
        int b = Integer.valueOf(inputStr[1]);
        int c = Integer.valueOf(inputStr[2]);
        int ans = c - (a - b);
        System.out.println(ans < 0? 0: ans);
    }
}