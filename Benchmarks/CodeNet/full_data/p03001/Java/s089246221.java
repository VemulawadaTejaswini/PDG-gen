import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double W = sc.nextDouble();
        double H = sc.nextDouble();
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        int isExist = 0;

        double minW = Math.min(W - x, x);
        double minH = Math.min(H - y, y);
        double maxS = Math.max(minW * H, minH * W);

        if(x == (W / 2) && y == (H / 2)){
            isExist = 1;
        }

        System.out.print(maxS + " " + isExist + "\n");
        
    }
}