import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < n; i++) b[i] = sc.nextInt();
        for (int i = 0; i < n; i++) c[i] = sc.nextInt();
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        long ans = 0;
        for (int i = 0; i < n; i++) {
            long aNum = binarySearchMax(a, b[i]) + 1;
            long cNum = c.length - binarySearchMin(c, b[i]);
            ans += aNum * cNum;
        }
        System.out.println(ans);
        sc.close();
    }

    public static int binarySearchMin(int[] array, int key){
        int ok = array.length;
        int ng = -1;
        while(1 < Math.abs(ok - ng)){
            int mid = (ok + ng) / 2;
            if(key < array[mid]) ok = mid;
            else ng = mid;
        }
        return ok;
    }

    public static int binarySearchMax(int[] array, int key){
        int ok = -1;
        int ng = array.length;
        while(1 < Math.abs(ok - ng)){
            int mid = (ok + ng) / 2;
            if(key > array[mid]) ok = mid;
            else ng = mid;
        }
        return ok;
    }

}
