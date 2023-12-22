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

        long cc = 1;
        long dc = 1;
        long ec = 1;

       if(n > 3) {
            for(int i = 3;i < n ;i++) {
                if(a[i] != c) {
                    cc++;
                    if(a[i] != d) {
                        dc++;
                        if(a[i] != e) {
                            ec++;
                            if(c == d) {
                                d = a[i];
                                dc = 1;
                            }else if(d == e){
                                e = a[i];
                                ec = 1;
                            }else if(c == e){
                                c = a[i];
                                cc = 1;
                            }else{
                                System.out.println("No");
                            System.exit(0);
                            }
                        }
                    } 
                }
            }
        }

        long f = c ^ d;
        if(f == e) {
            if(c == 0 && d == 0 && e == 0){
                System.out.println("Yes");
            }else {
                if(c != d && d != e && e != c) {
                    if(cc == dc && dc == ec) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                }
                if(c == 0) {
                    if(cc * 2 == dc + ec) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                }
                if(d == 0) {
                    if(dc * 2 == cc + ec) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                }
                if(e == 0) {
                    if(ec * 2 == dc + cc) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
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