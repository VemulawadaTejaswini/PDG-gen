import java.util.Scanner;

public class RGBBoxes {

    static int count = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] balls = new int[3];
        for(int i=0;i<3;i++){
            balls[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        helper(balls,0,n,0);
        System.out.println(count);
    }

    private static void helper(int[] balls, int ind, int n, int sum){
        if(ind == balls.length){
            if(sum == n){
                count++;
            }
            return;
        }else{
            for(int i=0;i<=(n/balls[ind]);i++){
                helper(balls,ind+1, n, sum+(i*balls[ind]));
            }
        }
    }
}
