import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        long[] a = new long[n];
        for(int i = 0; i < n; i++) {
            a[i] = stdIn.nextLong();
        }

        long c = a[0];
        long d = a[1];
        long e = a[2];

        if(n > 3) {
            for(int i = 3;i < n ;i++) {
                if(a[i] != c) {
                    if(a[i] != d) {
                        if(a[i] != e) {
                            if(c == d) {
                                d = a[i];
                            }else if(d == e){
                                e = a[i];
                            }else if(c == e){
                                c = a[i];
                            }else{
                                System.out.println("No");
                            System.exit(0);
                            }
                        }
                    } 
                }
            }
        }

        if(c != d && c != e && d != e){
            long x = 0;
            long y = 0;
            long z = 0;
            for(int i = 0 ;i< n;i++ ) {
                if(a[i] == c) {
                   x++; 
                }
                if(a[i] == d) {
                    y++;
                }
                if(a[i] == e) {
                    z++;
                }
            }
        }

        long f = c ^ d;
        if(f == e || c ==0 && d ==0 || c == 0 && e == 0|| d == 0 && e == 0) {
            if(c == 0 && d == 0 && e == 0){
                System.out.println("Yes");
            }else {
                if(c != d && c != e && d != e) {
                    if(x == y && y == z) {
                        System.out.println("Yes");
                        System.exit(0);
                    }else {
                        System.out.println("No");
                        System.exit(0);
                    }
                }
                if(n % 3 == 0) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }else {
            System.out.println("No");
        }






        // for(int i = 0;i < n - 2;i++) {
        //     long g = a[i] ^ a[i+2];
        //     if(g != a[i+1]) {
        //         System.out.println("No");
        //         System.exit(0);
        //     }
        // }

        // long h = a[n-2] ^ a[0];
        // if(h != a[n-1]) {
        //     System.out.println("No");
        //     System.exit(0);
        // }
        // h = a[n-1] ^ a[1];
        // if(h != a[0]) {
        //     System.out.println("No");
        //     System.exit(0);
        // }

        // System.out.println("Yes");

       
    }
}