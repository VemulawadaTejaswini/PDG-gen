import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        int result = 0;
        for (int i = 0; i < n;i++){
            for (int j = 0; j < n; j++){
                a[j] = -a[j];
            }
            result = result - a[i];
        }
        System.out.println(result);


    }
}





