import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        boolean flags[] = new boolean[n];
        for (int i = 0;i < n;++i){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        LinkedList<Long> output = new LinkedList<>();
        output.push(a[0]);
        int i1 = 1;
        int i2 = n - 1;
        for (int i = 1;i < n;++i){
            long t1 = Math.abs(output.getFirst() - a[i1]);
            long t2 = Math.abs(output.getLast() - a[i1]);
            long t3 = Math.abs(output.getFirst() - a[i2]);
            long t4 = Math.abs(output.getLast() - a[i2]);
            long m = Math.max(Math.max(t1,t2),Math.max(t3,t4));
            if(t1 == m){
                output.addFirst(a[i1]);
                ++i1;
            }
            else if(t2 == m){
                output.addLast(a[i1]);
                ++i1;
            }
            else if(t3 == m){
                output.addFirst(a[i2]);
                --i2;
            }
            else{
                output.addLast(a[i2]);
                --i2;
            }
        }
        long r = 0;
        long last = -1;
        for (long l:output){
            if(last >= 0)r += Math.abs(l - last);
            last = l;
        }
        System.out.println(r);

    }




}


