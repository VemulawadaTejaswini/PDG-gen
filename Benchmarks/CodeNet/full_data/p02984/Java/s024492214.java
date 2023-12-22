package atCoder;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //山の数
        int N = Integer.parseInt(sc.next());
        //ダムの数
        int [] Ni = new int[N];

        //総降雨量
        int S = 0;

        for (int i=0; i < N;i++) {

            //ダムごとの降った雨量
            Ni[i] = Integer.parseInt(sc.next());

            S += Ni[i];
        }

        sc.close();

        //1個目の山
        int X1 = ansX1(N, Ni, S);

        //i個目の山ごとの貯水量を出力
        ansXi(N, Ni, 0, X1, 0);

    }

    public static int ansX1(int N, int[] Ni, int S) {

        int X1 = S;

         for (int i = 1; i < N; i = i + 2) {

             X1 += - 2*Ni[i];
         }

         return X1;
    }

    public static int ansXi(int N, int[] Ni, int i, int X1, int Xi) {


        if (i == 0) {

            System.out.print (X1);
            System.out.print(" ");
            i++;
            return ansXi(N,Ni,i,X1,X1);

        } else if (i == N) {

            return -1;
        } else {

            int Xiadd1 = 2*Ni[i-1] -Xi;
            System.out.print(Xiadd1);
            System.out.print(" ");
            i++;
            return ansXi(N, Ni, i, X1, Xiadd1);
        }
    }

}
