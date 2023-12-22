import java.util.Scanner;

public class Main {

    static long[] A, B, Q;

    public static void main(String[] args) {

        int a, b, q;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        q = sc.nextInt();

        A = new long[a];
        B = new long[b];
        Q = new long[q];

        for(int i = 0; i < a; i++){

            A[i] = sc.nextLong();
        }

        for(int i = 0; i < b; i++){

            B[i] = sc.nextLong();
        }

        for(int i = 0; i < q; i++){

            Q[i] = sc.nextLong();
        }

        //

        for(int i = 0; i < q; i++){

            long a1,b1;
            long a2,b2;

            long x1,x2;

            a1 = hikaku(Q[i],A,a);
            b1 = hikaku(Q[i],B,b);


                a2 = atai(Q[i],A,a);
                b2 = atai(a2,B,b);

                x1 = Math.abs(Q[i] - a2) + Math.abs(a2 - b2);


                b2 = atai(Q[i],B,b);
                a2 = atai(b2,A,a);

                x2 = Math.abs(Q[i] - b2) + Math.abs(b2 - a2);


            if(x1 < x2){

                System.out.println(x1);
            }
            else {

                System.out.println(x2);
            }

        }
    }

    public static long hikaku(long q, long[] n,int y){

        long a = (long) Math.pow(10, 10);

        for(int i = 0; i < y; i++){

            if( Math.abs(n[i] - q) < a){

                a = Math.abs(n[i] - q);
            }
        }

        return a;
    }

    public static long atai(long q, long[] n,int y){

        long a = (long) Math.pow(10, 10);
        int x = 0;

        for(int i = 0; i < y ; i++){

            if( Math.abs(n[i] - q) < a){

                a = Math.abs(n[i] - q);
                x = i;
            }
        }

        return n[x];
    }

}