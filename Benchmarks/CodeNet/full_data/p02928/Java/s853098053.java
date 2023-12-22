import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        final int MOD = (int)1e9+7;
        
        int n = Integer.parseInt(sc.next());
        long k = Long.parseLong(sc.next());
        
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        
        Inversion in = new Inversion();
        int[] zaatu = in.zaatu(a);
        int[] revzaatu = new int[n];
        for(int i=0; i<n; i++){
            revzaatu[n-i-1] = zaatu[i];
        }
        long nt = in.inv(zaatu, MOD);
        long rv = in.inv(revzaatu, MOD);
        
        //System.out.println(nt + " : " + rv);
        //
        long s = (k+1)%MOD*(k%MOD)/2%MOD;
        long t = (k-1)%MOD*(k%MOD)/2%MOD;
        
        long ans1 = s*nt%MOD;
        long ans2 = t*rv%MOD;
        
        System.out.println((ans1+ans2)%MOD);
    }
}

class Inversion{
    public long inv(int[] a, int mod){
        long cnt = 0;
        int size = a.length;
        BinaryIndexedTree bit = new BinaryIndexedTree(size);
        
        for(int i=0; i<size; i++){
            int p = a[i];
            bit.add(p, 1);
            cnt += i + 1 - bit.sum(p);
            cnt %= mod;
        }
        return cnt;
    }
    
    //座圧(1-indexed)
    //使うとよい
    public int[] zaatu(int[] a){
        ArrayList<Integer> b = new ArrayList<>();
        for(int tmp : a){
            b.add(tmp);
        }
        
        b = new ArrayList<Integer>(new HashSet<>(b));
        Collections.sort(b);
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<b.size(); i++){
            map.put(b.get(i), i);
        }
        
        int[] c = new int[a.length];
        for(int i=0; i<a.length; i++){
            c[i] = map.get(a[i])+1;
        }
        
        return c;
    }
}

class BinaryIndexedTree{
    int size;
    long[] tree;
    
    public BinaryIndexedTree(int n){
        this.size = n;
        this.tree = new long[n+1];
    }
    
    public long sum(int i){
        long s = 0L;
        while(0<i){
            s += tree[i];
            i -= i & -i;
        }
        return s;
    }
    
    public void add(int i, int x){
        while(i<=size){
            tree[i] += x;
            i += i & -i;
        }
    }
}
