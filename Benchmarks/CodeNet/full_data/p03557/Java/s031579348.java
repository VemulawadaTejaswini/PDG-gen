import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        long[] c = new long[n];
        for(int i = 0; i < n; i++){
            a[i] = scanner.nextLong();
        }
        Arrays.sort(a);
        for(int i = 0; i < n; i++){
            b[i] = scanner.nextLong();
        }
        Arrays.sort(b);
        for(int i = 0; i < n; i++){
            c[i] = scanner.nextLong();
        }
        Arrays.sort(c);
        long ans = 0;
        for(int i = 0; i < n; i++){
            long aindex = lowerbound(a, b[i]);
            long cindex = higherbound(c,b[i]);
            //System.out.prlongln("target : " + b[i] +" aindex : " + aindex + " cindex : " + cindex);
            if(aindex!= -1 && cindex != -1){
                ans += (aindex) * (n-cindex);
                //System.out.prlongln(ans);
            } 
        }
        System.out.println(ans);
    }

    public static long lowerbound(long[] a, long key) {
        if(a[a.length-1] < key)
            return a.length;
        long lb = 0, ub = a.length-1;
        int mid = 0;
        do {
            mid = (int)(ub+lb)/2;
            if(a[mid] == key){return mid;}
            if(a[mid] < key)
                lb = mid + 1;
            else
                ub = mid;
        }while(lb < ub);
        return ub;
    }
    public static long higherbound(long[] a, long key) {
        if(a[0] > key)
            return 0;
        long lb = 0, ub = a.length-1;
        int mid = 0;
        do {
            mid = (int)(ub+lb)/2;
            if(a[mid] == key){return mid+1;}
            if(a[mid] < key)
                lb = mid + 1;
            else
                ub = mid;
        }while(lb < ub);
        return ub;
    }
}

