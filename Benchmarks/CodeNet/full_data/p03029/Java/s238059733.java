import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int p = in.nextInt();
        int result = (int)Math.floor((a*3+p)/2.0);
        System.out.println(result);
    }
}
