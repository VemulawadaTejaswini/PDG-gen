
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();

        int max = 1_000_000_000;

        int x1=max, y1 = 1;


        int y2 = S/x1;
        int x2 = y2*x1 -S;
        if(x2 < 0){
            y2++;
            x2 = y2*x1 -S;
        }

        System.out.println(String.format("0 0 %d %d %d %d",x1,y1,x2,y2));


    }

}
