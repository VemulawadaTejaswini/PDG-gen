import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] boss = new int[n];
        for (int i = 0; i < n; i++){
            boss[i]++;
        }
        for (int i : boss) {
            System.out.println(i);
        }
    }
}