import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println(new String[]{"Yes", "No"}[(sc.nextInt() % 500 <= sc.nextInt() ? 0 : 1)]);
    }
}