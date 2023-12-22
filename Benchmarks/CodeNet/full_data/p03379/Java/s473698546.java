import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Long[] array = new Long[n];
        Long[] arrayb = new Long[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLong();
            arrayb[i] = array[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i] < array[j]) {
                    long m = array[i];
                    array[i] = array[j];
                    array[j] = m;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (arrayb[i] <= array[(n / 2) - 1]) {
                System.out.println(array[n / 2]);
            } else {
                System.out.println(array[(n / 2) - 1]);
            }
        }
    }
}
