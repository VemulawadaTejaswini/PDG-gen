import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] arr = new int[1000000];

        int index = 0;
        int res = 0;
        while (true) {
            if (index == 0) {
                arr[index] = s;
                index++;
                continue;
            } else if(arr[index-1] % 2 == 0) {
                arr[index] = arr[index-1]/2;
            } else {
                arr[index] = 3 * arr[index-1] +1;
            }

            if (hasNum(arr, arr[index], index-1) && arr[index] != 0) {
                res = index;
                break;
            }

            index++;
        }

        System.out.println(res+1);
    }

    private static boolean hasNum(int[] arr, int key, int index) {
        boolean res = false;

        for (int i = 0; i <= index; i++) {
            if (arr[i] == key) {
                res = true;
                break;
            }
        }

        return res;
    }
}
