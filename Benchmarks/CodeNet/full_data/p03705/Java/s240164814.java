import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static int sLength;
    private static int sectionNumber = 2;
    private static int sCount;
    private static List<Integer> sData = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N, A, B;
        N = scanner.nextInt();
        A = scanner.nextInt();
        B = scanner.nextInt();
        if (B - A + 1 > N || B - A < 0) {
            System.out.println("0");
            return;
        }
        if (B - A + 1 == N) {
            System.out.println("1");
            return;
        }
        sLength += (A + B);
        findAllConnection(A, B, N);
        System.out.println(sCount);
    }

    public static void findAllConnection(int A, int B, int N) {
        if (sectionNumber == N) {
            if (!sData.contains(sLength)) {
                sCount++;
                sData.add(sLength);
            }
            return;
        }
        for (int i = A; i <= B; i++) {
            sLength += i;
            sectionNumber++;
            findAllConnection(A, B, N);
            sectionNumber--;
            sLength -= i;
        }
    }
}