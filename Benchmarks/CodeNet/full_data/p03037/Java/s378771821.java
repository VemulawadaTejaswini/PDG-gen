import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<card> cards = new ArrayList<>();
        for(int i = 0; i < m; i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            card c = new card(l,r);
            cards.add(c);
        }
        //cards.sort((a,b) -> a.l-b.l);
        int left = 0;
        int right = Integer.MAX_VALUE;
        for(card c : cards){
            left = Math.max(left,c.l);
            right = Math.min(right,c.r);
        }
        if(right-left < 0){
            System.out.println(0);
        }else{
            System.out.println(right-left+1);
        }
    }
}

class card{
    int l;
    int r;
    
    public card(int l, int r){
        this.l = l;
        this.r = r;
    }
}