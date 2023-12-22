import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        long[] a = new long[n];
        for(int i = 0; i < n; i++) {
            a[i] = stdIn.nextInt();
        }

        // long c = a[0];
        // long d = a[1];
        // long e = a[2];

        // if(n > 3) {
        //     for(int i = 3;i < n ;i++) {
        //         if(a[i] != c) {
        //             if(a[i] != d) {
        //                 if(a[i] != e) {
        //                     System.out.println("No");
        //                     System.exit(0);
        //                 }
        //             } 
        //         }
        //     }
        // }

        // long f = c ^ d;
        // if(f == e) {
        //     if(c == 0 && d == 0 && e == 0){
        //         System.out.println("Yes");
        //     }else {
        //         if(n % 3 == 0) {
        //             System.out.println("Yes");
        //         } else {
        //             System.out.println("No");
        //         }
        //     }
        // }else {
        //     System.out.println("No");
        // }

        for(int i = 0;i < n - 2;i++) {
            long g = a[i] ^ a[i+2];
            if(g != a[i+1]) {
                System.out.println("No");
                System.exit(0);
            }
        }

        long h = a[n-2] ^ a[0];
        if(h != a[n-1]) {
            System.out.println("No");
            System.exit(0);
        }
        h = a[n-1] ^ a[1];
        if(h != a[0]) {
            System.out.println("No");
            System.exit(0);
        }

        System.out.println("Yes");

       
    }
}