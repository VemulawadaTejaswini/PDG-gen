import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int g = 0;
        for (int b = 1; b <= (int)Math.sqrt(1000); b++) {
            for (int p = 2; p <= 10; p++) {
                if ((int)Math.pow(b,p) > x) {
                    break;
                } else {
                    g = (int)Math.pow(b,p);
                }
            }
        }
        System.out.print(g);
        sc.close();
    }
}