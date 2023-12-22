import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long Y = sc.nextLong();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        long[] p = new long[A];
        long[] q = new long[B];
        long[] r = new long[C];
        for(int i=0;i<A;i++){
            p[i] = sc.nextLong();
        }
        for(int i=0;i<B;i++){
            q[i] = sc.nextLong();
        }
        for(int i=0;i<C;i++){
            r[i] = sc.nextLong();
        }
        sortRev(p);
        sortRev(q);
        sortRev(r);
        int pi=0;
        int qi=0;
        int ri=0;
        long sum=0;
        while(X>0 && Y>0){
            if(ri < C && p[pi] < r[ri] && q[qi] < r[ri]){
                if(p[pi] < q[qi]){
                    X--;
                    sum += r[ri];
                    ri++;
                }else{
                    Y--;
                    sum += r[ri];
                    ri++;
                }
            }else if(p[pi] > q[qi]){
                X--;
                sum += p[pi];
                pi++;
            }else{
                Y--;
                sum += q[qi];
                qi++;
            }
        }
        while(X > 0){
            if(ri < C && p[pi] < r[ri]){
                X--;
                sum += r[ri];
                ri++;
            }else{
                X--;
                sum += p[pi];
                pi++;
            }
        }

        while(Y > 0){
            if(ri < C && q[qi] < r[ri]){
                Y--;
                sum += r[ri];
                ri++;
            }else{
                Y--;
                sum += q[qi];
                qi++;
            }
        }
        System.out.println(sum);
    }
    private static void sortRev(long[] a){
        Arrays.sort(a);
        for(int i=0;i<a.length/2;i++){
            long tmp = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = tmp;
        }
    }
}
