import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            int v = array[i];
            if (v > max) {
                max = v;
            }
        }

        int num = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < array.length; j++) {
                num += (i - array[j]) * (i - array[j]);
            }
            if (min > num){
                min = num;
            }

            num = 0;
        }

        System.out.println(min);


    }


}
