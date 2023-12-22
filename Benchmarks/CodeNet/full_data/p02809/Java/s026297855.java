import java.util.*;
import java.lang.*;

class Counter<T> extends TreeMap<T,Long>{
    public Counter(){
        super();
    }
    public Counter(List<T> list){
        super();
        for(T e: list) this.addOne(e);
    }
    public Long count(Object elm){
        return getOrDefault(elm,0L);
    }
    public void add(T elm, long amount){
        if(!this.containsKey(elm)) put(elm, amount);
        else replace(elm, get(elm)+amount);
        if(this.count(elm)==0) this.remove(elm);
    }
    public void addOne(T elm){
        this.add(elm, 1);
    }
    public void removeOne(T elm){
        this.add(elm, -1);
    }
    public void removeAll(T elm){
        this.add(elm, this.count(elm));
    }
    public static<T> Counter<T> merge(Counter<T> a, Counter<T> b){
        Counter<T> c = new Counter<>();
        for(T x: a.keySet()) c.add(x, a.count(x));
        for(T y: b.keySet()) c.add(y, b.count(y));
        return c;
    }
}

public class Main {
    static void impossible(){
        System.out.println("-1");
        System.exit(0);
    }
    static void possible(List<Integer> ans){
        ans = new ArrayList<>(ans);
        for(int i=0; i<ans.size()-1; i++){
            System.out.print(ans.get(i)+1);
            System.out.print(" ");
        }
        System.out.println(ans.get(ans.size()-1)+1);
        System.exit(0);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int n=0; n<N; n++) a[n] = sc.nextInt()-1;

        if(N==2) impossible();

        TreeSet<Integer> card = new TreeSet<>();
        for(int n=0; n<N; n++) card.add(n);

        ArrayList<Integer> ans = new ArrayList<>();

        Counter<Integer> b = new Counter<>();
        for(int n=0; n<N; n++) b.addOne(a[n]);

        for(int k:b.keySet()) if(b.get(k)==N-1){
            ans.add(k); card.remove(k);
            if(card.first().equals(a[k])){
                ans.add(card.higher(a[k]));
                card.remove(card.higher(a[k]));
            }
            while(!card.isEmpty()) ans.add(card.pollFirst());
            possible(ans);
        }

        ans.add(card.pollFirst());
        int cur = 0;
        while(!card.isEmpty()){
            int next = card.first().equals(a[cur]) ? card.higher(card.first()) : card.first();
            ans.add(next); card.remove(next);
            cur = next;
        }
        possible(ans);






    }

}
