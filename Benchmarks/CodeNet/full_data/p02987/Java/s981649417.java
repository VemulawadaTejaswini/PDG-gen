import java.util.*;
import java.io.*;

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
    static void yes(){
        System.out.println("Yes");
        System.exit(0);
    }
    static void no(){
        System.out.println("No");
        System.exit(0);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        Counter<Character> count = new Counter<>();
        for(int i=0; i<S.length(); i++) count.addOne(S.charAt(i));
        for(char c: count.keySet()) if(count.get(c)!=2) no();
        yes();
    }
}