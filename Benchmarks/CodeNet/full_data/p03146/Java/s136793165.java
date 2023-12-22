import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] a = new int[1000000];
        Scanner sc = new Scanner(System.in);
        a[0] = sc.nextInt();
        int m = 0;
        while(!(a[m]==4 || a[m]==2 || a[m]==1)) {
            if(a[m]%2 == 0) a[m+1] = a[m]/2;
            else a[m+1] = 3*a[m] + 1;
            m++;
        }
        System.out.println((m+1)+3);
    }
}