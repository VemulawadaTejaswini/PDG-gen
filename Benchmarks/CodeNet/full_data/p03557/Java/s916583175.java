import java.util.Arrays;
import java.util.Scanner;

public class Main{
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static int[] a = new int[n];
    static int[] b = new int[n];
    static int[] c = new int[n];

    public static void main(String[] args){
        for (int i=0; i<n; i++) a[i] = sc.nextInt();
        Arrays.sort(a);
        for (int i=0; i<n; i++) b[i] = sc.nextInt();
        Arrays.sort(b);
        for (int i=0; i<n; i++) c[i] = sc.nextInt();
        Arrays.sort(c);

        long ans = 0;

        for (int i=0; i<n; i++){
            long low = lowerBound(a, b[i])+1;
            long up = n-lowerBound1(c, b[i]+1)-1;

//            long up = n-upperBound(c, b[i]);
            long tmp = low*up;
            ans += tmp;
        }

        System.out.println(ans);

    }

    public static int lowerBound(int[] array, int value) {
        int left = 0;
        int right = array.length;
        while (right - left > 1) {
            int middle = (right + left) / 2;
            if (array[middle] < value) {
                left = middle;
            } else {
                right = middle;
            }
        }
//        System.out.println(left);
        return left;
    }


    public static int lowerBound1(int[] array, int value) {
        int left = 0;
        int right = array.length;
        while (right - left > 1) {
            int middle = (right + left) / 2;
            if (array[middle] < value) {
                left = middle;
            } else {
                right = middle;
            }
        }
//        System.out.println(left);
        return left;
    }




//    public static int upperBound(int[] array, int value) {
//        int left = 0;
//        int right = array.length;
//        while (right - left > 1) {
//            int middle = (right + left) / 2;
//            if (array[middle] <= value) {
//                left = middle;
//            } else {
//                right = middle;
//            }
//        }
//        System.out.println(left);
//        return left;
//    }

}