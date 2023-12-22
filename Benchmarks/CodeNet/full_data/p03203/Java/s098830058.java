import java.util.*;
import java.io.*;

/*
   AtCoder contest code
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
        //whenever Tak hold, Aok can hold and end the game.
        //Therefore, Tak's best strategy is "Always move"!



        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int N = sc.nextInt();
        LinkedList<Integer>[] block = new LinkedList[H];
        for(int h=0; h<H; h++){
            block[h] = new LinkedList<>();
            block[h].add(W);
        }
        for(int n=0; n<N; n++) {
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            block[y].add(x);
        }
        for(int h=0; h<H; h++) Collections.sort(block[h]);

        int ans = 1000000;
        int curX = 0;
        for(int h=0; h<H; h++){
            if(block[h].contains(curX+1)){
                ans = Math.min(ans, curX+1);
                break;
            }
            curX++;
            while(block[h].peek()<curX) block[h].poll();

            ans = Math.min(ans, block[h].peek());

            while(h<H-1 && block[h+1].contains(curX)) curX++;
            if(curX >= block[h].peek()) break;
        }

        System.out.println(ans);


    }
}