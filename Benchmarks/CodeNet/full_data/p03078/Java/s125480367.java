import java.util.*;
import java.lang.*;

class LimitedBag<T> extends PriorityQueue<T>{
    int maxItem;
    public LimitedBag(int max){
        super();
        this.maxItem = max;
    }

    @Override
    public boolean add(T t) {
        boolean ret = super.add(t);
        if(super.size()>maxItem) super.poll();
        return ret;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        int K = sc.nextInt();
        long[] A = new long[X];
        for(int x=0; x<X; x++) A[x]=sc.nextLong();
        long[] B = new long[Y];
        for(int y=0; y<Y; y++) B[y]=sc.nextLong();
        long[] C = new long[Z];
        for(int z=0; z<Z; z++) C[z]=sc.nextLong();


        LimitedBag<Long> twoLayer = new LimitedBag<>(K);
        for(long a:A) for(long b:B) twoLayer.add(a+b);

        LimitedBag<Long> threeLayer = new LimitedBag<>(K);
        for(long t:twoLayer) for(long c:C) threeLayer.add(t+c);

        List<Long> answer = new ArrayList<>(threeLayer);
        Collections.sort(answer, Collections.reverseOrder());
        for(long a:answer) System.out.println(a);

    }
}
