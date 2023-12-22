import java.util.Scanner;

public class Main {
    public int evenPatternCount (int num) {
        int count = 0;
        for (int i = num - 1; i >= 1; i--) {
            count += i;
        }

        return count;
    }

    public static void main(String[] args) {
        Main MyClass = new Main();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int evenCount = 0;

        evenCount += MyClass.evenPatternCount(N);
        evenCount += MyClass.evenPatternCount(M);

        System.out.println(evenCount);
    }
}