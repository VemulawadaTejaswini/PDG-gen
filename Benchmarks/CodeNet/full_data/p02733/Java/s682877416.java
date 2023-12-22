import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int H = scan.nextInt();
        int W = scan.nextInt();
        int K = scan.nextInt();

        int[][] ar = new int[H][W];
        int[][] sum = new int[H+1][W];

        //read the value
        for (int i = 0; i < ar.length; i++) {
            String v = scan.next();
            for (int j = 0; j < v.length(); j++) {
                ar[i][j] = v.charAt(j) - '0';
            }
        }

        //calculate sum
        for (int i = 1; i <= H; i++) {
            for (int j = 0; j < W; j++) {
                sum[i][j] += sum[i-1][j] + ar[i-1][j];
            }
        }

        int ans = Integer.MAX_VALUE;
        //find the state and do the seperation
        loop:
        for (int i = 0; i < (1 << H - 1); i++) {

            //create all the seperations
            ArrayList<Integer> sep = new ArrayList<>();
            sep.add(0);
            for (int j = 0; j < H; j++) {
                if( (i & (1 << j)) != 0 ){
                    sep.add(i+1);
                }
            }
            sep.add(H);


            int count = Integer.bitCount(i); // count of all the horizontal lines

            int[] whites = new int[sep.size()-1];
            for (int j = 0; j < W; j++) {
                boolean sup = false;
                for (int k = 0; k < sep.size()-1; k++) {
                    if(whites[k] + sum[sep.get(k+1)][j] - sum[sep.get(k)][j] > K){
                        sup = true;
                        break;
                    }
                }

                for (int k = 0; k < sep.size() - 1; k++) {
                    if(!sup){
                        whites[k] += sum[sep.get(k+1)][j] - sum[sep.get(k)][j];
                    }else{
                        whites[k] = sum[sep.get(k+1)][j] - sum[sep.get(k)][j];
                        if(whites[k] > K){
                            continue loop;
                        }
                    }
                }

                if(!sup){
                    count++;
                }
            }

            ans = Math.min(ans,count);
        }

        System.out.println(ans);

    }
}
