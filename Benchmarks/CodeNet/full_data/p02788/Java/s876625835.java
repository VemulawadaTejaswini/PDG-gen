import java.util.*;

class Main{
    long N,D,A;

    class Enemy{
        long X, H;

        public Enemy(long X, long H){
            this.X = X;
            this.H = H;
        }
    }

    public static void main(String args[]) throws Exception{
        Main main = new Main();
    }

    public Main(){
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextLong();
        D = scanner.nextLong();
        A = scanner.nextLong();

        ArrayList<Enemy> enemy = new ArrayList<Enemy>();

        for(int i=0;i<N;i++){
            enemy.add(new Enemy(scanner.nextLong(),scanner.nextLong()));
        }
        enemy.sort( (a,b)-> (int)(a.X - b.X) );

        long number, d, i, total = 0L;
        Enemy e;
        for(long f=0;f<N;f++){
            e = enemy.get((int)f);
            number = e.H/A;
            if(e.H - (e.H/A)*A > 0)number++;
            total += number;
            d = e.X + D*2;

            i=1;
            while(f+i < N){
                e = enemy.get((int)(f+i));
                if(e.X <= d)
                    e.H = e.H - A*number;
                else
                    break;
                i++;
            }
        }

        System.out.println(total);
    }
}
