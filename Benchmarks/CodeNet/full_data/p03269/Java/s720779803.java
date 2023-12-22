


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String [] args) {
        final Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        final int [][] edges = new int[20][20];
        final Set<Double>[][] lengths = new HashSet[20][20];
        final int [] pow = new int[20];
        int i = 0;
        int largest = 0;
        while (L > 0) {
            pow[i] = L % 2;
            if (pow[i] == 1) {
                largest = i;
            }
            L /= 2;
            ++i;
        }
        for (i = 0; i <= largest; ++i) {
            for (int j = 0; j <= largest; ++j) {
                lengths[i][j] = new HashSet<>();
            }
        }
//        for (i = 0; i < 20; ++i) {
//            System.out.println("pow[" + i + "]: " + pow[i]);
//        }
//        System.out.println("largest: " + largest);
        int edgeNum = 0;
        for (i = 0; i < largest; ++i) {
            edges[i][i + 1] = 2;
            edgeNum += 2;
            lengths[i][i + 1].add((double)0);
            lengths[i][i + 1].add(Math.pow(2, i));
        }
        double maxLength = Math.pow(2, largest) - 1;

        for (i = largest - 1; i >= 0; --i) {
            if (pow[i] == 1) {
                edges[i][largest]++;
                lengths[i][largest].add(maxLength + 1);
                maxLength = Math.max(maxLength, maxLength + Math.pow(2, i));
                ++edgeNum;
            }
        }
        System.out.println(largest + 1 + " " + edgeNum);
        for (i = 0; i <= largest; ++i) {
            for (int j = i; j <= largest; ++j) {
                for (final double length : lengths[i][j]) {
                    System.out.println((i + 1) + " " + (j + 1) + " " + (int)length);
                }
            }
        }
    }
}
