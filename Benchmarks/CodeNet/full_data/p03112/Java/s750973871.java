import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int Q = Integer.parseInt(sc.next());
        long[] arrayA = new long[A];
        long[] arrayB = new long[B];


        for(int i = 0; i<A; i++) {
            arrayA[i] = Long.parseLong(sc.next());
        }

        for(int i = 0; i<B; i++) {
            arrayB[i] = Long.parseLong(sc.next());
        }

        for(int i = 0; i<Q; i++) {
            long x = Long.parseLong(sc.next());
            long aval = searchMiniValHead(arrayA, x);
            long bval = searchMiniValHead(arrayB, aval);
            long ans = (long)Math.abs(aval-x) + (long)Math.abs(aval-bval);

            aval = searchMiniValHead(arrayA, x);
            bval = searchMiniValEnd(arrayB, aval);
            ans = Math.min(ans, (long)Math.abs(aval-x) + (long)Math.abs(aval-bval));

            aval = searchMiniValEnd(arrayA, x);
            bval = searchMiniValHead(arrayB, aval);
            ans = Math.min(ans, (long)Math.abs(aval-x) + (long)Math.abs(aval-bval));

            aval = searchMiniValEnd(arrayA, x);
            bval = searchMiniValEnd(arrayB, aval);
            ans = Math.min(ans, (long)Math.abs(aval-x) + (long)Math.abs(aval-bval));

            bval = searchMiniValHead(arrayB, x);
            aval = searchMiniValHead(arrayA, bval);
            ans = Math.min(ans, (long)Math.abs(bval-x) + (long)Math.abs(bval-aval));

            bval = searchMiniValHead(arrayB, x);
            aval = searchMiniValEnd(arrayA, bval);
            ans = Math.min(ans, (long)Math.abs(bval-x) + (long)Math.abs(bval-aval));

            bval = searchMiniValEnd(arrayB, x);
            aval = searchMiniValHead(arrayA, bval);
            ans = Math.min(ans, (long)Math.abs(bval-x) + (long)Math.abs(bval-aval));

            bval = searchMiniValEnd(arrayB, x);
            aval = searchMiniValEnd(arrayA, bval);
            ans = Math.min(ans, (long)Math.abs(bval-x) + (long)Math.abs(bval-aval));

            System.out.println(ans);
        }

    }

    public static long searchMiniValEnd(long[] array, long x) {
        if(array.length == 1) return array[0];
        int head = 0;
        int end = array.length-1;
        int middle = (head+end)/2;
        while(head+1!=end) {
            if(array[middle] < x) {
                head = middle;
                middle = (head+end)/2;
            }
            else if(array[middle] > x) {
                end = middle;
                middle = (head+end)/2;
            }
        }
        return array[end];
    }

    public static long searchMiniValHead(long[] array, long x) {
        if(array.length == 1) return array[0];
        int head = 0;
        int end = array.length-1;
        int middle = (head+end)/2;
        while(head+1!=end) {
            if(array[middle] < x) {
                head = middle;
                middle = (head+end)/2;
            }
            else if(array[middle] > x) {
                end = middle;
                middle = (head+end)/2;
            }
        }
        return array[head];
    }
}