import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Scanner
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int m = sc.nextInt();

        int x = sc.nextInt();

        int y = sc.nextInt();

        int greatestX = -1000;

        int leastY=1000;

        for(int i = n; i > 0; i--) {
            int thisX = sc.nextInt();
            if(thisX > greatestX)
              greatestX = thisX;
        }

        for(int i = m; i > 0; i--) {
            int thisY = sc.nextInt();
            if(thisY > leastY)
              leastY = thisY;
        }

        if(greatestX >= leastY)
            System.out.print("WAR");
        else
            System.out.print("NO WAR");

    }
}