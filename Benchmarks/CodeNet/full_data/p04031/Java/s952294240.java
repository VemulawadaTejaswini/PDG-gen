import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int x;
        int mincost;
        int result =0;
        Scanner input =  new Scanner(System.in);
        x=input.nextInt();
        int[] arr = new int[x];
        for(int i =0 ;i<x;i++){
            arr[i]=input.nextInt();
        }

        Arrays.sort(arr);
        int min =Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        mincost = (int) Math.pow(min-max,2);
        for(int i=-100;i<=100;i++){
            for(int j=0;j<arr.length;j++){
                result+=Math.pow(arr[j]-i,2);

            }
            if(result<mincost){
                mincost=result;
            }
            result=0;
        }

        System.out.println(mincost);

    }
}