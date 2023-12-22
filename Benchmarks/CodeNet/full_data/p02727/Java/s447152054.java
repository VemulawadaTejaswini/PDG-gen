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
        LinkedList<Long> newP, newQ;
        newP = new LinkedList<>();
        newQ = new LinkedList<>();
        for(int i=0;i<X;i++){
            newP.add(p[i]);
        }
        for(int i=0;i<Y;i++){
            newQ.add(q[i]);
        }

        ListIterator<Long> pli = newP.listIterator();
        ListIterator<Long> qli = newQ.listIterator();
        while(ri < C) {
/*            while (pi < X && newP.get(pi) >= r[ri]) {
                pi++;
            }*/
            while(pli.hasNext() && pli.next() >= r[ri]){}
            if(pli.previous() >= r[ri]){
                pli.next();
            }
            /*  while (qi < Y && newQ.get(qi) >= r[ri]) {
                qi++;
            }*/
            while(qli.hasNext() && qli.next() >= r[ri]){}
            if(qli.previous() >= r[ri]){
                qli.next();
            }

            if(!pli.hasNext() && !qli.hasNext()){
                break;
            }else if(!pli.hasNext()){
                qli.add(r[ri]);
                ri++;
                continue;
            }else if(!qli.hasNext()){
                pli.add(r[ri]);
                ri++;
                continue;
            }else{
                if(pli.next() < qli.next()) {
                    pli.previous();
                    qli.previous();
                    pli.add(r[ri]);
                }else {
                    pli.previous();
                    qli.previous();
                    qli.add(r[ri]);
                }
                ri++;
            }
        }
        long sum=0;
        for(int i=0;i<X;i++){
            sum += newP.get(i);
        }
        for(int i=0;i<Y;i++){
            sum += newQ.get(i);
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
