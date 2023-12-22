import java.util.*;
import java.io.*;

public class Main {
    public static int pay(int price, Set<Integer> hateNum){
        if(hateNum.contains(price%10)) return pay(price+1,hateNum);
        if(price<10) return price;
        return pay(price/10,hateNum)*10+(price%10);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Set<Integer> hateNum = new HashSet<>();
        for(int k=0;k<K;k++) hateNum.add(sc.nextInt());
        System.out.println(pay(N,hateNum));
    }
}