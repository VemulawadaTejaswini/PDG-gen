import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int g = 0;
        for (int a = 1; a <= x; a++) {
            for (int b = 1; b <= x; b++) {
                if (a * b >= x) {
                    break;
                } else {
                    g = (int)Math.pow(a,b);
                }
            }
        }
        System.out.print(g);
        sc.close();
    }
}