import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        boolean debug = false;
        if (debug = false) {
            return;
        }
        System.out.println(str);
    }

    //木構造
    public static void main(String[] args) {

        int N;
        int D;
        int[][] xList;
        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            D = sc.nextInt();
            xList = new int[N][D];
            for(int i = 0;i < N; i++){
                for(int j = 0;j < D; j++){
                    xList[i][j] = sc.nextInt();
                }
            }
        }
        int result = 0;
        for(int i = 0;i < N; i++){
            for(int j = i;j < N; j++){
                if(i == j){
                    continue;
                }
                if(check(xList[i] , xList[j]))
                    result++;
            }
        }

        System.out.println(result);
    }

    private static  boolean check(int i[] , int j[]){
        int length = i.length;
        int dis = 0;
        for(int d = 0; d < length;d++){
            int temp = j[d]- i[d];
            dis += temp * temp;
        }
        double t = Math.sqrt(dis);
        int ii = (int) (t / 1);
        return (double)ii == t;
    }

}
