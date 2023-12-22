import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();  // white, '.', false
        int B = sc.nextInt();  // black, '#', true
        boolean map[] = new boolean[99*99];

        Arrays.fill(map, false);

        for (int i = 99*50; i < 99*99; i++) {
            map[i] = true;
        }

        for (int i = 0; i < A - 1; i++) {
            map[i*2] = true;
        }

        for (int i = 0; i < B - 1; i++) {
            map[99*51 + i*2] = false;
        }

        for (int i = 0; i < 99; i++) {
            for (int j = 0; j < 99; j++) {
                System.out.print(map[i*99 + j] ? "." : "#");
            }
            System.out.println("");
        }
    }
}
