import java.util.*;

public class Main {
    public static void main(String[] args){
        int N;
        Scanner sc = new Scanner (System.in);
        N = sc.nextInt();
        Map <Integer, Integer> mp = new HashMap<Integer, Integer>();
        int h;
        for (int i=1; i<=N; i++){
            h = sc.nextInt();
            mp.put(h, i);
        }
        for (int i=1; i<=N; i++){
            System.out.print(mp.get(i)+" ");
        }
        System.out.println();
    }
}