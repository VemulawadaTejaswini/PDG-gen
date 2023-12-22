import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tairyoku = scanner.nextInt();
        int kougekiryoku = scanner.nextInt();

        int kaisuu = tairyoku/kougekiryoku;
        if (tairyoku%kougekiryoku>0){
            kaisuu++;
        }

        System.out.println(kaisuu);
    }
}
