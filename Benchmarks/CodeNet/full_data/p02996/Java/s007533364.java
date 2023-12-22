import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] array = new long[n][2];
        for (int i = 0; i < n; i++) {
            array[i][0] = sc.nextLong();
            array[i][1] = sc.nextLong();
        }
        
        Arrays.sort(array, (a, b) -> Long.compare(a[1], b[1]));
        // for (long[] a : array) {
        //     System.out.println(Arrays.toString(a));
        // }
        
        
        boolean ok = true;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            if (sum + array[i][0] <= array[i][1]) {
                sum += array[i][0];
            } else {
                ok = false;
                break;
            }
        }
        
        if (ok) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    // public static void main(String[] args) throws Exception {
    //     // Your code here!
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     long[][] array = new long[n][3];
    //     for (int i = 0; i < n; i++) {
    //         array[i][0] = sc.nextLong();
    //         array[i][1] = sc.nextLong();
    //         array[i][2] = array[i][1] - array[i][0];
    //     }
        
    //     Arrays.sort(array, (a, b) -> Long.compare(b[2], a[2]));
    //     for (long[] a : array) {
    //         System.out.println(Arrays.toString(a));
    //     }
        
        
    //     long now = array[0][2];
    //     boolean ok = true;
    //     for (int i = 1; i < n; i++) {
    //         if (now - array[i][0] <= array[i][2]) {
    //             now -= array[i][0];
    //         } else {
    //             now = array[i][2];
    //         }
            
    //         if (now < 0) {
    //                 ok = false;
    //                 break;
    //         }
    //     }
        
    //     if (ok) {
    //         System.out.println("Yes");
    //     } else {
    //         System.out.println("No");
    //     }
    // }
}
