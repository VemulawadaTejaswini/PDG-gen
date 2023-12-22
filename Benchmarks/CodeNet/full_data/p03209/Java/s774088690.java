import java.util.*;
import java.io.*;

/*
   AtCoder contests
   coder : yoichion
 */

public class Main {
    public static long total(int level){
        if (level<=0) return 1;
        return 3 + 2 * total(level-1);
    }
    public static long patty(int level){
        if (level<=0) return 1;
        return 1 + 2 * patty(level-1);
    }
    public static long eat(int level, long layer){
        if(layer<=0) return 0;
        if(level==0) return 1;
        if(layer >= total(level)) return patty(level);

        if(layer <= 1 + total(level-1)){
            return eat(level-1, layer-1);
        }
        if(layer == 2 + total(level-1)){
            return 1 + patty(level-1);
        }
        return patty(level-1) + 1 + eat(level-1, layer-total(level-1)-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long X = sc.nextLong();
        System.out.println(eat(N,X));
    }
}