import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int D = Integer.parseInt(sc.next());
        double[][] Xnd = new double[N][D];
        for (int i = 0; i < N; i++) {

            for (int j=0; j < D;j++) {

                Xnd[i][j] = Integer.parseInt(sc.next());
            }
        }

        sc.close();

        int ansCount = 0;

        //必要な計算量はNC2回,N個の座標のうちのi番目(1,2・・・N-1)
        for (int i = 0; i < N-1; i++) {

            //i番目に対してのj番目(i+1,2・・・N)の座標
            for (int j = i+1; j < N; j++) {

                double sum = 0;
                double distance = 0;

                //(Xnd[i][~]-Xnd[j][~])^2
                for (int Dindex = 0; Dindex < D; Dindex++) {

                    sum += Math.pow((Xnd[i][Dindex] - Xnd[j][Dindex]),2);
                }

                distance = Math.sqrt(sum);
                //i,j番目の座標の距離が整数ならカウント
                if (isNumber(distance)) {

                    ansCount++;
                }
            }
        }

        System.out.println(ansCount);
    }

    public static boolean isNumber(double val) {

        boolean retval = val == Math.floor(val) ? true : false;

        return retval;
    }
}
