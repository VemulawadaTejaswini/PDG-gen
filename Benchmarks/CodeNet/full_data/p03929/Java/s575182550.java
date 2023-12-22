

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int COL_NUM = 7;
        final int SUB_SIZE = 3;
        final int BASE = 11;
        int mod_delta = (COL_NUM*SUB_SIZE*SUB_SIZE) % BASE;
        int N = sc.nextInt();
        int K = sc.nextInt();
//        int [][] calcMatrix = new int[COL_NUM-2][N-2];
        int []calcMatrix = new int [COL_NUM-2];
        int cnt = 0;
        for(int col=0;col<COL_NUM-2;col++){
            for(int row=0;row< N-2;row++){
                int sum=0;
                if (row==0){
                    calcMatrix[col]= ((col+1+col+2+col+3)*SUB_SIZE + COL_NUM*SUB_SIZE*SUB_SIZE)%BASE;
                    if (calcMatrix[col]==K) cnt++;
                }
                else{
                    if((calcMatrix[col] + mod_delta) >= BASE)
                        calcMatrix[col] = (calcMatrix[col] + mod_delta) - BASE;
                    else
                        calcMatrix[col] = calcMatrix[col] + mod_delta;
                    if (calcMatrix[col] == K) cnt++;

                }
            }
        }


        System.out.println(cnt);

        sc.close();

    }

}
