import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i  = 0; i<n; i++) a[i] = sc.nextInt();

        Arrays.sort(a);

        if(n%2==0) {
            int num = 1;
            for(int i =0; i<n; i=i+2) {
                if(a[i]!=a[i+1] || a[i] != num) {
                    System.out.println(0);
                    return;
                }
                num += 2;
            }
        } else {
            int num = 2;
            if(a[0] != 0) {
                System.out.println(0);
                return;
            }
            for(int i =1; i<n; i=i+2) {
                if(a[i]!=a[i+1] || a[i] != num) {
                    System.out.println(0);
                    return;
                }
                num += 2;
            }
        }
        System.out.println((long)(Math.pow(2,n/2)));

    }
}