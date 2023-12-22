import java.util.*;

public clss Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        int small = 0;
        int smallCount = 0;
        int big = 0;
        int bigCount = 0;
        while(n >= k) {
            for(int i = 0; i < k; i++) {
                for(int j = 0; j < k; j++) {
                    small += j;
                    smallCount++;
                }
                for(int j = n; j < k; j--) {
                    big += j;
                    bigCount++;
                }
                count += big - small;
                small = 0; smallCount = 0;
                big = 0; bigCount = 0;
                k++;
            }
        }
    }
}