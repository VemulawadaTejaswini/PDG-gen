import java.util.*;
public class Main {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> minus = new ArrayList<>();
        long sumM = 0;
        long sumP = 0;
        int[] a= new int[n];
        int[] b= new int[n];
        PriorityQueue<Integer> plus = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int a1 = a[i];
            int b1 = b[i];
            if (b1 > a1) {
                minus.add(b1-a1);
                sumM+=(long)(b1-a1);
            }
            if (a1 > b1) {
                plus.add(a1-b1);
                sumP+=(long)(a1-b1);
            }
        }
        if (sumM > sumP) {
            System.out.println(-1);
            return;
        }
        if (sumM == 0) {
            System.out.println(0);
            return;
        }

        int carry = 0;
        int change = minus.size();
        for (int m : minus) {
            while (carry < m) {
                carry += plus.poll();
                change++;
            }
            carry -= m;
        }
        System.out.println(change);
    }
}