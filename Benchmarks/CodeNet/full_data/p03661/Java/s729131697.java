import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int card[] = new int[n];
        int total = 0;
        for (int i = 0;i < n;++i){
            card[i] = scanner.nextInt();
            total += card[i];
        }
        long sub = card[0] * 2,i2 = Math.abs(total - sub);
        long i3;
        long sub2 = sub;
        for (int i = 0;i < n;++i){
            sub += card[i] * 2;
            if((i3 = Math.abs(total - sub)) < i2){
                i2 = i3;
                sub2 = sub;
            }
        }
        long a1 = (total - sub2 / 2);
        long a2 = total - a1;
        System.out.println(Math.abs(a1 - a2));

    }


}