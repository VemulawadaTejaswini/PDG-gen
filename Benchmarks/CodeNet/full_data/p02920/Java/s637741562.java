import java.util.*;
import java.lang.*;

class Counter<T> extends TreeMap<T,Long>{
    public Counter(){
        super();
    }
    public Counter(T[] array){
        super();
        for(int i=0; i<array.length; i++) this.add(array[i], 1L);
    }
    public Counter(List<T> list){
        super();
        for(T elm:list) this.add(elm, 1L);
    }
    public Counter(Map<T,Long> m){
        super(m);
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
        this.add(elm, 1L);
    }
}

public class Main {
    static void possible(){
        System.out.println("Yes");
        System.exit(0);
    }
    static void impossible(){
        System.out.println("No");
        System.exit(0);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = 1<<N;
        Counter<Long> S = new Counter<>();
        for(int k=0; k<K; k++) S.addOne(sc.nextLong());

        long firstSlime = S.lastKey();

        Counter<Long> currentSlimes = new Counter<>();
        Counter<Long> unfoundSlimes = new Counter<>(S);
        currentSlimes.addOne(firstSlime);
        unfoundSlimes.add(firstSlime, -1L);

        for(int t=0; t<N; t++){
            Counter<Long> nextSlimes = new Counter<>(currentSlimes);
            for(Long slimeHealth: currentSlimes.keySet()){
                long smileAmount = currentSlimes.get(slimeHealth);
                for(long a=0; a<smileAmount; a++){
                    Long weakerSlime = unfoundSlimes.lowerKey(slimeHealth);
                    if(weakerSlime==null) impossible();
                    nextSlimes.addOne(weakerSlime);
                    unfoundSlimes.add(weakerSlime, -1L);
                }
            }
            //System.err.println(nextSlimes);
            currentSlimes = nextSlimes;
        }

        possible();


    }
}
