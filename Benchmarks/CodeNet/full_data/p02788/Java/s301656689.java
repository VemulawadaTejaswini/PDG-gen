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
        int i;
        for(int f=0;f<N;f++){
            if(enemy[f][1]<=0)continue;
            number = enemy[f][1]/A;
            if(enemy[f][1] - number*A > 0)number++;
            total += number;
            d = enemy[f][0] + D*2L;

            i=1;
            while(f+i < N){
                if(enemy[f+i][0] <= d)
                    enemy[f+i][1] -= A*number;
                else
                    break;
                i++;
            }
        }

        System.out.println(total);
    }
}
