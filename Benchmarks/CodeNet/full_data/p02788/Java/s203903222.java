import java.util.*;

class Main{
    int N;
    int[] group;
    long D,A;
    long[][] enemy;

    public static void main(String args[]) throws Exception{
        Main main = new Main();
    }

    public Main(){
        Scanner scanner = new Scanner(System.in);
        N = Integer.parseInt(scanner.next());
        D = Long.parseLong(scanner.next());
        A = Long.parseLong(scanner.next());

        enemy = new long[N][2];
        group = new int[N];

        for(int i=0;i<N;i++){
            enemy[i][0] = Long.parseLong(scanner.next());
            enemy[i][1] = Long.parseLong(scanner.next());
        }
        Arrays.sort(enemy, (a,b)->(int)(a[0]-b[0]));

        long d;
        int groupNum = 0, end = 0;
        while(true){
            d = enemy[groupNum][0] + D*2;

            while(end<N && enemy[end][0]<=d){
                group[end] = groupNum;
                end++;
            }

            groupNum++;
            if(end == N)break;

        }

        long[] damage = new long[groupNum];

        long number, hp, total = 0L;
        int limit;
        for(int f=0;f<N;f++){
            hp = enemy[f][1] - damage[group[f]];
            if(hp<=0) continue;

            number = (hp+A-1)/A;
            total += number;

            limit = Math.min(f,groupNum-1);
            for(int i=group[f];i<=limit;i++){
                damage[i] += number*A;
            }
        }

        System.out.println(total);
    }
}
