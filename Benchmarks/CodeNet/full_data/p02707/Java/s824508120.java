
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] a = new int[num + 1];
        int[] b = new int[num + 1];
        a[0] = 0;
        b[0] = 0;
        for (int i = 1; i <= num; i++){
            if (i == 1)
                a[i] = 0;
            else
                a[i] = sc.nextInt();
            if (a[i] == 1)
                b[1]++;
            if (i > 2)
                b[i] = 0;
        }
        for (int i = 2; i <= num; i++){
            for (int j = 1; j <= num; j++){
                if (a[j] == i){
                    b[i] += 1;
                }
            }
        }
        for (int i = 1; i <= num; i++) {
            System.out.println(b[i]);
        }
    }
}
