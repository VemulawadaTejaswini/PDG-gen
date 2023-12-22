import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int W = scan.nextInt();
        int H = scan.nextInt();
        int x = scan.nextInt();
        int y = scan.nextInt();

        int area = W * H;
        int point = x * y;

        int flag =  0;
        if (x * 2 == W && y * 2 == H) {
            flag = 1;
        }

        System.out.println((double)area/2 + " " + flag);

    }
}
