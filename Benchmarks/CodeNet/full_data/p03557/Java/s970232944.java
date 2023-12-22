import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        for(int i = 0; i < n; i++){
            b[i] = scanner.nextInt();
        }
        Arrays.sort(b);
        for(int i = 0; i < n; i++){
            c[i] = scanner.nextInt();
        }
        Arrays.sort(c);
        int ans = 0;
        for(int i = 0; i < n; i++){
            int aindex = lowerbound(a, b[i]);
            int cindex = higherbound(c,b[i]);
            //System.out.println("target : " + b[i] +" aindex : " + aindex + " cindex : " + cindex);
            if(aindex!= -1 && cindex != -1){
                ans += (aindex) * (n-cindex);
                //System.out.println(ans);
            } 
        }
        System.out.println(ans);
    }

    public static int lowerbound(int[] a, int key) {
        if(a[a.length-1] < key)
            return a.length;
        int lb = 0, ub = a.length-1, mid;
        do {
            mid = (ub+lb)/2;
            if(a[mid] < key)
                lb = mid + 1;
            else
                ub = mid;
        }while(lb < ub);
        return ub;
    }
    public static int higherbound(int[] a, int key) {
        if(a[0] > key)
            return 0;
        int lb = 0, ub = a.length-1, mid;
        do {
            mid = (ub+lb)/2;
            if(a[mid] == key){return mid+1;}
            if(a[mid] < key)
                lb = mid + 1;
            else
                ub = mid;
        }while(lb < ub);
        return ub;
    }
}

