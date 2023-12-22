import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int h = sc.nextInt();
        int w = sc.nextInt();
        int c = W / w;
        int d = H / h;
        int resX = W % w;
        sc.close();
        int resY = H % h;
        if (resX == 0 && resY == 0) {
            System.out.println("No");
            return;
        }
        // 余りの数
        int edge = resX * H + resY * W - resX * resY;
        int a = 0;
        int anum = h * w - 1;
        while (a * edge <= c * d) {
            a++;
            if (a > 1000000000) {
                System.out.println("No");
                return;
            }
            if (a * anum + 1 > 1000000000) {
                System.out.println("No");
                return;
            }
        }
        int b = a * anum + 1;
        b *= -1;
        System.out.println("Yes");
        for (int j = 1; j < H + 1; j++) {
            if (j % h != 0) {
                for (int i = 1; i < W + 1; i++) {
                    System.out.print(a);
                    if (i != W) {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
                continue;
            }
            for (int i = 1; i < W + 1; i++) {
                if (i % w == 0) {
                    System.out.print(b);
                } else {
                    System.out.print(a);
                }
                if (i != W) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
