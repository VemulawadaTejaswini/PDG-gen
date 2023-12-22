import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = ""+n;
        int ketawa = 0;
        for(char c : s.toCharArray()) {
            int keta = Integer.parseInt(String.valueOf(c));
            ketawa += keta;
        }
        System.out.println(n % ketawa == 0 ? "Yes" : "No");
    }
}