import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int xx = x2 - x1;
        int yy = y2 - y1;
        System.out.println((x2 - yy) + " " + (y2 + xx) + " " + (x1 - yy) + " " + (y1 + xx));
    }


}


