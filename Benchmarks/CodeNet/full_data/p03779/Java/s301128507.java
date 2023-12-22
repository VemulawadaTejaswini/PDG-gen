import java.util.*;

public class Main{

    static class Stat{
        int x;
        int i;

        public Stat(int x, int i){
            this.x = x;
            this.i = i;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        ArrayDeque<Stat> q = new ArrayDeque<>();
        q.add(new Stat(0,0));

        while(true){
            Stat stat = q.poll();
            if(stat.x == x){
                System.out.print(stat.i);
                return;
            }
            stat.i++;
            if(stat.x < x){
                q.add(new Stat(stat.x + stat.i, stat.i));
                q.add(new Stat(stat.x, stat.i));
            }else{
                q.add(new Stat(stat.x - stat.i, stat.i));
                q.add(new Stat(stat.x, stat.i));
            }
        }

    }
}
