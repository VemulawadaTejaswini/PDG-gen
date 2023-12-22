import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();

        char[][] chr = new char[H+2][W+2];

        for (int i = 1; i < H+1; i++) {
            String line = sc.next();
            for (int j = 1; j < W+1; j++) {
                chr[i][j] = line.charAt(j-1);
            }
        }
        
        for (int i = 1; i < H+1; i++) {
            for (int j = 1; j < W + 1; j++) {
                if (chr[i][j] == '.') {
                    int count = 0;
                    for (int p = -1; p < 2; p++) {
                        for (int q = -1; q < 2; q++) {
                            if (chr[i + p][j + q] == '#' && !(p % 2 == 0 && q % 2 == 0)) {
                                count++;
                            }
                        }
                    }
                    System.out.print(count);
                } else {
                    System.out.print('#');
                }
            }
            System.out.println();
        }
    }
}