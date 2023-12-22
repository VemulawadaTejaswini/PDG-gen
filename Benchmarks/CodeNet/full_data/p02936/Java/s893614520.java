import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();
        long[] score = new long[n];
        long[] sum = new long[n];
        int[][] save = new int[2][n-1];
        //保存
        for(int i =0; i< n-1;i++ ){
            save[0][i] = sc.nextInt()-1;
            save[1][i] = sc.nextInt()-1;

        }
//        System.out.println("");
//        for(int p = 0; p< n-1; p++){
//            System.out.println(save[0][p] + " " + save[1][p]);
//        }
        //それぞれの得点
        for(int j=0; j<q; j++){
            score[sc.nextInt()-1] += sc.nextLong();


        }
        //合計
//        for(int o=0;o<q; o++){
//         score[o] += score[o];
//        }

        for(int k= 0; k< n-1;k++ ){
            score[save[1][k]] += score[save[0][k]];
        }
        for(int l =0; l< n ; l++) {
            System.out.print(score[l] + " ");
        }

    }

}
