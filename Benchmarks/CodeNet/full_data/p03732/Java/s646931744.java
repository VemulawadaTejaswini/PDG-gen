import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Integer> stones[];
    static int W;
    static int N;
    static int F;
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        W = scanner.nextInt();
        stones = new ArrayList[4];
        for (int i = 0;i < 4;++i){
            stones[i] = new ArrayList<>();
        }
        for (int i = 0;i < N;++i){
            int w = scanner.nextInt();
            int v = scanner.nextInt();
            if(i == 0){
                F = w;
            }
            stones[w - F].add(v);
        }
        for (int i = 0;i < 4;++i){
            stones[i].sort((a,b) -> b - a);
        }
        System.out.println(search(0,0,0,0,0));
    }

    public static long search(int i1,int i2,int i3,int i4,long w){
        boolean flag = false;
        long r = 0;
        if(w + F <= W && i1 + 1 <= stones[0].size()) {
            long s = search(i1 + 1, i2, i3, i4, w + F);
            if (r < s) r = s;
            flag = true;
        }
        if(w + F + 1 <= W && i2 + 1 <= stones[1].size()) {
            long s = search(i1 , i2 + 1, i3, i4, w + F + 1);
            if (r < s) r = s;
            flag = true;
        }
        if(w + F + 2 <= W && i3 + 1 <= stones[2].size()) {
            long s = search(i1, i2, i3 + 1, i4, w + F + 2);
            if (r < s) r = s;
            flag = true;
        }
        if(w + F + 3 <= W && i4 + 1 <= stones[3].size()) {
            long s = search(i1, i2, i3, i4 + 1, w + F + 3);
            if (r < s) r = s;
            flag = true;
        }
        if(!flag){
            for (int i = 0;i < i1;++i){
                r += stones[0].get(i);
            }
            for (int i = 0;i < i2;++i){
                r += stones[1].get(i);
            }
            for (int i = 0;i < i3;++i){
                r += stones[2].get(i);
            }
            for (int i = 0;i < i4;++i){
                r += stones[3].get(i);
            }
        }
        return r;
    }

}


