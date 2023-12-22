import java.util.*;

public class Main {

    public static int maxIndex(int[] array, boolean[] used) {
        int index = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (!used[i] && max < array[i]) {
                index = i;
                max = array[i];
            }
        }
        return index;
    }

    public static void printScore(int[] array, boolean[] used) {
        int alice = 0;
        int bob = 0;
        boolean flag = true;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            index = maxIndex(array, used);
            used[index] = true;
            if (flag) {
                alice += array[index];
            } else {
                bob += array[index];
            }
            flag = !flag;
        }
        System.out.println(alice - bob);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }
        boolean[] used = new boolean[N];
        printScore(array, used);
    }

}
