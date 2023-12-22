import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer arrays[] = new Integer[n];
        int stepCnt  = 0;
        int stepSize = 101;

        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(arrays, Collections.reverseOrder());

        for(int size:arrays) {
            if(stepSize > size) {
                stepCnt++;
                stepSize = size;
            }
        }
        System.out.println(stepCnt);

    }
}