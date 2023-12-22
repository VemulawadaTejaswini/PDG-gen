import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] arr = new int [n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        long tot = 1000000000;
        for (int i = 0; i < 200; i++) {
            int t = 0;
            for (int j = 0; j < n; j++) {
                t = t +(int) Math.pow((arr[j]-i),2);
            }
            tot = Math.min(tot, t);
        }
        System.out.println(tot);

    }

}

