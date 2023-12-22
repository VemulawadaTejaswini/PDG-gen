import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int card[] = new int[n];
        int total = 0;
        for (int i = 0;i < n;++i) {
            card[i] = scanner.nextInt();
            total += card[i];
        }
        long sub = card[0];
        double subd = Long.MAX_VALUE;
        for (int i = 1;i < n;++i){
            double i2 = Math.abs(total / 2D - sub);
            if(i2 < subd){
                subd = i2;
            }
            if(i >= n - 2){
                break;
            }
            sub += card[i];
        }
        System.out.println((int)(subd * 2));

    }


}