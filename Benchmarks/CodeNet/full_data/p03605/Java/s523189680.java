import java.util.*;

public class Main
{
    public static final void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = N / 10;
        int b = N % 10;
        if (a == 9 || b == 9) System.err.println("Yes");
        else System.err.println("No");
    }
}
