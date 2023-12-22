import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        long sum = 0;
        long ans = 0;
        long[] ansa = new long[11];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt() - (i + 1);
            sum += array[i];
        }
        long ave = sum / n;
        for (int i = 0; i < n; i++) {
            ansa[0] += Math.abs(array[i] - ave);
        }
        for (int i = 0; i < n; i++) {
            ansa[1] += Math.abs(array[i] - (ave - 5));
        }
        for (int i = 0; i < n; i++) {
            ansa[2] += Math.abs(array[i] - (ave - 4));
        }
        for (int i = 0; i < n; i++) {
            ansa[3] += Math.abs(array[i] - (ave - 3));
        }
        for (int i = 0; i < n; i++) {
            ansa[4] += Math.abs(array[i] - (ave - 2));
        }
        for (int i = 0; i < n; i++) {
            ansa[5] += Math.abs(array[i] - (ave - 1));
        }
        for (int i = 0; i < n; i++) {
            ansa[6] += Math.abs(array[i] - (ave + 1));
        }
        for (int i = 0; i < n; i++) {
            ansa[7] += Math.abs(array[i] - (ave + 2));
        }
        for (int i = 0; i < n; i++) {
            ansa[8] += Math.abs(array[i] - (ave + 3));
        }
        for (int i = 0; i < n; i++) {
            ansa[9] += Math.abs(array[i] - (ave + 4));
        }
        for (int i = 0; i < n; i++) {
            ansa[10] += Math.abs(array[i] - (ave + 5));
        }
        Arrays.sort(ansa);
        System.out.println(ansa[0]);
    }    
}
