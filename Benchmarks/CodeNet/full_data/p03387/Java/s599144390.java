import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] arr = new Integer[3];
        int total = 0;
        for(int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        Arrays.sort(arr, Collections.reverseOrder());

        int cnt = 0;
        while(total%3!=0 || arr[0]*3>total) {
            cnt++;
            total+=2;
        }
        System.out.println(cnt);
    }
}
