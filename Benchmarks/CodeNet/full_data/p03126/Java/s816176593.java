import java.util.*;
import java.io.*;

/*
   AtCoder contest
   coder : yoichidon
 */

class Counter<T> extends HashMap<T,Integer>{
    public Counter(){
        super();
    }
    public Integer get(Object elm){
        return getOrDefault(elm,0);
    }
    public void add(T elm, int amount){
        if(!this.containsKey(elm)) put(elm, amount);
        else replace(elm, get(elm)+amount);
    }
    public void addOne(T elm){
        add(elm, 1);
    }
    public void remove(T elm, int amount){
        replace(elm, Math.max(get(elm)-amount, 0));
    }
    public void removeOne(T elm){
        remove(elm, 1);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        Counter<Integer> favorite = new Counter<>();
        for(int n=0; n<N; n++){
            int K = sc.nextInt();
            for(int k=0; k<K; k++){
                favorite.addOne(sc.nextInt());
            }
        }

        int ans = 0;
        for(Integer food:favorite.keySet()){
            if(favorite.get(food).equals(N)) ans++;
        }
        System.out.println(ans);


    }
}
