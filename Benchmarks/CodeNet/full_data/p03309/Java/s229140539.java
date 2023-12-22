import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

class Main {
    public static long kanacy(long b, long[] a) {
        long sum=0;
        for(int i=0; i<a.length; i++) {
            sum += Math.abs(a[i] - (b+i+1));
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        ArrayList<Long> offset = new ArrayList<>();
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
            offset.add(a[i] - (i+1));
        }
        sc.close();

        offset.sort(Comparator.naturalOrder());

        long b = offset.get(offset.size()/2);
        
        System.out.println(kanacy(b, a));
    }
}