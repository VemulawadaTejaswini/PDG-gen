import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] S = sc.next().toCharArray();
        int zidx = String.valueOf(S).indexOf('z');
        String res = "-1";
        if(S.length < 26) {
            for(int c = 'a'; c < 'z'; c++) {
                boolean flag = true;
                for(char ch : S) if(c == ch) {
                    flag = false;
                    break;
                }
                if(flag) {
                    res = String.valueOf(S) + (char)c;
                    break;
                }
            }
        } else if(nextPermutation(S)) {
            res = String.valueOf(S).substring(0, zidx);
        }
        System.out.println(res);
    }
    public static boolean nextPermutation(char[] array) {
        int num = array.length;
        for(int i = num - 2; i >= 0; i--) {
            if(array[i] < array[i + 1]) {
                int j = num;
                do {
                    j--;
                } while(array[i] > array[j]);
                swap(array, i , j);
                Arrays.sort(array, i + 1, num);

                return true;
            }
            if(i == 0) {
                reverse(array);
            }
        }
        return false;
    }
    public static void swap(char[] array, int a, int b) {
        char tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }
    public static void reverse(char[] array) {
        int num = array.length;
        for(int i = 0; i < num / 2; i++) {
            swap(array, i, num - i - 1);
        }
    }
}
