import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int t = 0;
        int i = 0;
        while (t < x) {
            i++;
            t += i;
        }
        System.out.println(i);
    }
}