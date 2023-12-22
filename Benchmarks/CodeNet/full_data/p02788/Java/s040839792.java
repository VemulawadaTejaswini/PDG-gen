import java.util.*;

class Main{
    int N;
    long D,A;
    long[][] enemy;

    public static void main(String args[]) throws Exception{
        Main main = new Main();
    }

    public Main(){
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        D = scanner.nextLong();
        A = scanner.nextLong();

        enemy = new long[N][2];
        for(int i=0;i<N;i++){
            enemy[i][0] = scanner.nextLong();
            enemy[i][1] = scanner.nextLong();
        }
        Arrays.sort(enemy, (a,b)->(int)(a[0]-b[0]));

        long number, d, total = 0L;
        int end=1;
        for(int f=0;f<N;f++){
            if(enemy[f][1]<=0) continue;

            number = (enemy[f][1] + A - 1)/A;
            total += number;
            d = enemy[f][0] + D*2L;

            while(end<N && enemy[end][0]<=d )end++;
            for(int i=f+1;i<end;i++){
                enemy[i][1] -= number*A;
            }
        }

        System.out.println(total);
    }
}
