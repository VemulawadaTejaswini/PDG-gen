import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] arr = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        
        int i = 0;
        int k = 0;
        while (i < arr.length) {
            int nmax = max;
            for (int t = 0; t < arr.length; t++) {
                if (t == max) {
                    if (arr[t] > 0) {
                        arr[t] -= a;
                        if (arr[t] <= 0) i++;
                    }
                }
                else {
                    if (arr[t] > 0) {
                        arr[t] -= b;
                        if (arr[t] <= 0) i++;
                        if (arr[t] > arr[nmax]) nmax = t;
                    }
                }
            }
            k++;
            
            max = nmax;
        }
        
        System.out.println(k);
    }
}