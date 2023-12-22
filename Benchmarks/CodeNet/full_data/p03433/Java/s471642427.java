import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int A = scanner.nextInt();

        int modN = N%500;

        String ans = "No";
        if (modN<=A){
            ans = "Yes";
        }
        System.out.println(ans);
        scanner.close();
    }
}