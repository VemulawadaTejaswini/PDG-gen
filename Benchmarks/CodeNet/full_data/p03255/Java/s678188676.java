import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();

        int k = 0;

        List<Integer> xList = new ArrayList<>();

        for(int i=0; i<N; i++){
            xList.add(sc.nextInt());
        }

        int cost = 0;
        int pos = 0;
        int posNext = 0;
        int delta = 0;

        pos = xList.get(xList.size()-1);
        cost += calMove(pos, k);
        cost += X;
        k += 1;

        for(int i=xList.size()-2; i>=0; i--){
            pos = xList.get(i);
            posNext = xList.get(i+1);
            delta = posNext - pos;

            cost += calMove(delta, k);
            cost += X;
            k += 1;
        }

        cost += calMove(pos, k);
        cost += X;
        System.out.print(cost);
    }

    private static int calMove(int delta, int k){
        return delta * (k + 1) * (k+1);
    }
}