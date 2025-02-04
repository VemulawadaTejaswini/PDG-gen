

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        PrintWriter out = new PrintWriter(System.out);
        Scanner sc = new Scanner(System.in);
        Task task = new Task();
        task.solve(sc, out);
        out.flush();
        sc.close();
    }
    private static class Task{
        public void solve(Scanner sc, PrintWriter out){

            int n = nint(sc);
            int m = nint(sc);
            int s = nint(sc);
            int t = nint(sc);
            long[][] inputList= new long[m][4];
            for (int i=0; i<m;i++){
                inputList[i][0] = nlong(sc);
                inputList[i][1] = nlong(sc);
                inputList[i][2] = nlong(sc);
                inputList[i][3] = nlong(sc);
            }
            for (int year = 0; year<n; year++){
                long maxSunuke = 0;
                for (int j = year; j < n ; j++){
                    boolean isChangedSunuke = false;
                    long startYen = 1000000000000000L;
                    Dijkstra Di = new Dijkstra();
                    startYen -=Di.execute(n, m, s-1, j,
                            isChangedSunuke, inputList);
                    isChangedSunuke = true;
                    long resultSunuke = startYen - Di.execute(n, m, t-1, j,
                            isChangedSunuke, inputList);
                    if(maxSunuke <= resultSunuke){
                        maxSunuke = resultSunuke;
                    }
                }
                out.println(maxSunuke);

            }
        }
    }

    public static class Dijkstra{
        public long execute(int numOfCity, int numOfRoute,
                            int startCity, int dstCity, boolean isChangedSunuke,
                              long[][] inputList){
            // 都市と道路の接続関係を示すマップ
            long[][] map = new long[numOfCity][numOfCity];
            //　マップの初期化
            for(int i=0; i<numOfCity; i++){
                for(int j=0; j< numOfCity; j++){
                    map[i][j] = (i==j) ? 0:-1;
                }
            }
            //　道路状況の読み込み
            for (int i=0; i<numOfRoute; i++){
                int from = (int) inputList[i][0]-1 ;
                int to = (int) inputList[i][1]-1 ;
                long yen = inputList[i][2];
                long sunuke =  inputList[i][3];
                long length =0;
                if (isChangedSunuke) {
                    length = sunuke;
                } else{
                    length = yen;
                }
                map[from][to] =  length;
                map[to][from] = length;
            }

            // 各都市までの最短距離
            long[] distance = new long[numOfCity];
            dijkstra(map, startCity, distance);
            return distance[dstCity];

        }

        private void dijkstra(long[][] map, int startCity, long[] distance){
            int numOfCity = distance.length;
            // 最短距離の確定したか
            boolean[] isFixed = new boolean[numOfCity];

            for (int i=0; i<numOfCity; i++){
                distance[i] = Integer.MAX_VALUE;
                isFixed[i] = false;
            }

            // 出発点までの距離を０とする
            distance[startCity] = 0;
            while (true){
                // 未確定の中で最も近い都市を求める
                int marked = minindex(distance, isFixed);
                // 全都市が確定した場合
                if (marked < 0) return;
                // 非連結グラフ
                if (distance[marked] == Integer.MAX_VALUE) return;
                // その都市までの最短距離は確定
                isFixed[marked] = true;
                // 隣の都市
                for (int i=0; i<numOfCity;i++){
                    // 未確定ならば
                    if (map[marked][i] > 0 && !isFixed[i]){
                        long newDistance = distance[marked] + map[marked][i];
                        //　今までのよりも小さければ、それを覚える
                        if (newDistance < distance[i]) distance[i] = newDistance;
                    }
                }
            }
        }


        private  int minindex(long[] distance, boolean[] isFixed){
            int index = 0;
            // 未確定の都市をどれかさがす
            for(;index < isFixed.length; index++){
                if (!isFixed[index]) break;
            }
            // 未確定の都市が存在しなければ-1
            if (index == isFixed.length) return -1;
            // 距離が小さいものを探す
            for (int i = index + 1; i<isFixed.length;i++){
                if (!isFixed[i] && distance[i] < distance[index]) index =i;
            }
            return index;
        }
    }


    static int nint(Scanner sc){
        return Integer.parseInt(sc.next());
    }
    static long nlong(Scanner sc){
        return Long.parseLong(sc.next());
    }
    static double ndouble(Scanner sc){
        return Double.parseDouble(sc.next());
    }
    static float nfloat(Scanner sc){
        return Float.parseFloat(sc.next());
    }
    static String nstr(Scanner sc){
        return  String.valueOf(sc.next());
    }
    static long[] longLine(Scanner sc, int size){
        long[] lLine = new long[size];
        for (int i = 0; i < size; i++) {
            lLine[i] = nlong(sc);
        }
        return lLine;
    }
    static int[] intLine(Scanner sc, int size){
        int[] iLine = new int[size];
        for (int i = 0; i < size; i++) {
            iLine[i] = nint(sc);
        }
        return iLine;
    }
    static String[] strLine(Scanner sc, int size){
        String[] strLine = new String[size];
        for (int i = 0; i < size; i++) {
            strLine[i] = nstr(sc);
        }
        return strLine;
    }
}