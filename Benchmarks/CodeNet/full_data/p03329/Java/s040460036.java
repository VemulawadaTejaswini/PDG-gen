import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        //int[] array = {59049,46656,7776,6561,1296,729,216,81,36,9,6,1};
        int[] array1 = {93312,59049,46656,23328,19683,15552,13122,7776,6561,2592,1458,1296,729,216,81,36,27,12,9,6,1};
        int[] array2 = {2,1,1,3,3,2,2,1,1,2,2,2,1,1,1,1,1,2,1,1,1};
        while (0 < n) {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] <= n) {
                    count += array2[i];
                    n -= array1[i];
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
