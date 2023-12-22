import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int H = sc.nextInt();
        final int W = sc.nextInt();
        final int D = sc.nextInt();

        Map<Integer, Position> positions = new HashMap<>();
        for (int j =1; j<=W;j++){
            for (int i=1; i<=H; i++){
                positions.put(sc.nextInt(), new Position(i, j));
            }
        }

        Double Q = sc.nextDouble();
        Position now;
        Position next;
        for (int q=1; q<=Q;q++){
            int mp = 0;
            int x = sc.nextInt();
            int R = sc.nextInt();
            while(x != R){
                now = positions.get(x);
                x += D;
                next = positions.get(x);
                mp += Math.abs(next.i - now.i) + Math.abs(next.j - now.j);
            }
            System.out.println(mp);
        }
    }
}

class Position{
    int i;
    int j;
    public Position(int i, int j){
        this.i = i;
        this.j = j;
    }
}