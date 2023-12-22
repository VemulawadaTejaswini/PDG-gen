import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int[] ar = new int[n];
        for(int i =0; i < n; i++)
            ar[i] = sc.nextInt();
        long count = 0;
        int total, numElm;
        for(long i = 1; i < 1 << n; i++){
            total = 0;
            numElm = 0;
            for(int j = 0; j < n; j++){
                if((i & (1 << j)) >> j == 1) {
                    total += ar[j];
                    numElm += 1;
                }
            }
            if(numElm > 0 && (numElm * a == total))
                count += 1;
        }
        System.out.println(count);
    }
}
