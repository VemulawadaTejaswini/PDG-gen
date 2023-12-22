import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        int num = scan.nextInt();
        int[] up = new int[100001];
        int[] down = new int[100001];
        for(int i = 0; i < num; i++){
            if(i % 2 == 1){
                up[scan.nextInt()] += 1;
            } else {
                down[scan.nextInt()] += 1;
            }
        }

        // search
        int upFirst = 0;
        int upFirstIndex = 0;
        int upSecond = 0;
        int downFirst = 0;
        int downFirstIndex = 0;
        int downSecond = 0;
        for(int i = 1; i <= 100000; i++){
            if(up[i] > upFirst){
                upFirst = up[i];
                upFirstIndex = i;
            } else if(up[i] > upSecond){
                upSecond = up[i];
            }
            if(down[i] > downFirst){
                downFirst = down[i];
                downFirstIndex = i;
            } else if(down[i] > downSecond){
                downSecond = down[i];
            }
        }

        // answer
        int min = 0;
        if(upFirstIndex != downFirstIndex){
            min = (num / 2 - upFirst) + (num / 2 - downFirst);
        } else {
            min = (num / 2 - upFirst) + (num / 2 - downSecond);
            if((num / 2 - downFirst) + (num / 2 - upSecond) < min){
                min = (num / 2 - downFirst) + (num / 2 - upSecond);
            }
        }    
        System.out.println(min);

    }
}