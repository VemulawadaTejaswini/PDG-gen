import java.util.*;

import static java.lang.Math.round;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        double[][] b = new double[n][d];
        double sum =0;
        int count =0;
//        格納
        for(int i=0; i <n; i++) {
            for(int j =0; j <d ; j++ ) {
                b[i][j] = sc.nextDouble();
            }
        }



//        三重（何番目の座標なのか、ひかくする先の座標、何次元なのか)
        for(int k=0; k< n-1; k++){
            for(int l=k+1; l< n; l++){
                sum =0;
                for(int m=0; m< d; m++){
                    sum += Math.pow((b[k][m] - b[l][m]),2);

                }
                sum = Math.pow(sum, 0.5);
                if(sum - round(sum)==0){
                    count++;
                }
            }
        }

        System.out.println(count);

        }
    }