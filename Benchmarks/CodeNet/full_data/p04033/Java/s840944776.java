import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int len = b - a + 1;
        int arr[] = new int[len];
        for(int i = 0; i < len; i++) {
            arr[i] = a + i;
        }
        int result = Arrays.binarySearch(arr, 0);
        if(a <= 0 && b >= 0) {
            System.out.println("Zero");
            return;
        }
        if(b < 0) {
            result++;
            result *= -1;
        }
        if(result <= 0 || result % 2 == 0) {
            System.out.println("Positive");
        }else {
            System.out.println("Negative");
        }
    }
}
