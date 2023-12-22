import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        char[][] map = new char[H][];
        for(int i = 0 ; i < H ; i++)
            map[i] = sc.next().toCharArray();
        long[][] dp = new long[H+1][W+1];
        dp[1][1] = 1;
        ArrayDeque<P> deq = new ArrayDeque<P>();
        deq.add(new P(1,1));
        while (!deq.isEmpty())
        {
            P current = deq.remove();
            if(current.x >H || current.y >W )
                continue;
            if(map[current.x-1][current.y-1] == '#')
                continue;
            deq.add(new P(current.x ,current.y+1));
            deq.add(new P(current.x + 1 ,current.y));
            dp[current.x][current.y] =  (dp[current.x-1][current.y] + dp[current.x][current.y-1]+dp[current.x][current.y] % (1000000000+7));
            map[current.x-1][current.y-1] = '#';
        }
        System.out.println(dp[H][W]% (1000000000+7));

    }
    static class P extends AbstractMap.SimpleImmutableEntry<Integer,Integer>{
        int x , y;
        public P(int a , int b)
        {
            super(a,b);
            x =a ;
            y =  b;
        }
    }
}
