import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] data = new int[N][2];
        ArrayList<ArrayList> points = new ArrayList<>();
        for (int i = 0 ; i < N ; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            data[i][0] = x;
            data[i][1] = y;
            ArrayList<Integer> set = new ArrayList<>();
            set.add(i + 1);
            points.add(set);
        }
        int ans = 0;
        double sum = 0.0;
        while (!points.isEmpty()){
             ArrayList<Integer> currentSet = points.remove(0);
             if(currentSet.size() == N){
                 sum += getSum(currentSet, data);
                 ans ++;
             } else {
                 for (int i = 1 ; i < N + 1; i++){
                     if (!currentSet.contains(i)){
                         ArrayList<Integer> newSet = new ArrayList<>(currentSet);
                         newSet.add(i);
                         points.add(newSet);
                     }
                 }
             }
        }
        System.out.println(sum / ans);
        sc.close();
    }

    public static double getSum(List<Integer> point, int data[][]){
        double sum = 0;
        for (int i = 1 ; i < point.size(); i++){
            int x1 = data[point.get(i - 1) - 1][0];
            int y1 = data[point.get(i - 1) - 1][1];
            int x2 = data[point.get(i) - 1][0];
            int y2 = data[point.get(i) - 1][1];
            sum += getDistance(x1, y1, x2, y2);
        }
        return sum;
    }

    public static double getDistance(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }
}
