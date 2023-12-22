import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        double area = w*h;

        double ans=area/2;
        int cuttable=0;

        if (x==w/2 && y==h/2) {
            cuttable = 1;
        }

        System.out.print(ans);
        System.out.print(" ");
        System.out.println(cuttable);
    }
}
