import java.util.Scanner;

public class Main {
    public static void show(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        int fSize = Math.max(a, b) * 2;
        char[][] field = new char[fSize][fSize];
        for (int i = 0; i < fSize; i++) {
            for (int j = 0; j < fSize; j++) {
                field[i][j] = (j <= i ? i%2 == 0 : j%2 == 0) ? '#' : '.';
            }
        }
        if(a < b) {
            for (int i = a * 2; i < fSize - 1; i += 2) {
                field[i][0] = '.';
            }
        } else if(a > b) {
            for (int i = b * 2 - 1; i < fSize - 1; i += 2) {
                field[i][0] = '#';
            }
        }
        System.out.println(fSize + " " + fSize);
        show(field);
    }
}
