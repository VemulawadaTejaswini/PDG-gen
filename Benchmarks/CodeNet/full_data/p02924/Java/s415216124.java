import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int result = 0;
        for(int i=0;i<n;i++) result += i;
        System.out.println(result);
    }
}