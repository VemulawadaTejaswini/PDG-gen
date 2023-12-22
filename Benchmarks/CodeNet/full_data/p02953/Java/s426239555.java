import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] H = new int[N];
        for(int i = 0; i < N; i++){
            H[i] = sc.nextInt();
        }

        if ((H[max_index(H)] - H[min_index(H, max_index(H))]) > 1)
            System.out.println("No");
        else
            System.out.println("Yes");
        
    }

    static int max_index(int[] a) {
        int max = a[0];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                index = i;
            }
        }
        return index;
    }

    static int min_index(int[] a, int t) {
        int min = a[t];
        int index = t;
        for (int i = t; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
                index = i;
            }
        }
        return index;
    }
}