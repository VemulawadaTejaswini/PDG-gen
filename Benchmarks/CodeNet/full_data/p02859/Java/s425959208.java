import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        sc.close();

        int result = r * r;

        System.out.println(result);
    }
}