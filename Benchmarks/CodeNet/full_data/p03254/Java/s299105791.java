import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();

        int[] a = new int[n];
        for(int i=0; i<n; i++)
            a[i] = in.nextInt();

        Arrays.sort(a);

        int cnt = 0;
        for(int i=0; i<n-1; i++) {
            if(x >= a[i]) {
                x -= a[i];
                cnt++;
            } else {
                break;
            }
        }

        if(x == a[n-1]) cnt++;

        System.out.println(cnt);
    }
}