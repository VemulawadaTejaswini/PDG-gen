import java.util.*;
import java.io.*;

public class Main{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
            int[] arr = new int[3];
            
            for(int i=0 ; i<3 ; i++){
                arr[i] = in.nextInt();
            }
            int sum1 = Math.abs(arr[0]-arr[1]) + Math.abs(arr[1] -arr[2]);
            int sum2 =  Math.abs(arr[0]-arr[2]) + Math.abs(arr[1] -arr[2]);
            int sum3 =  Math.abs(arr[1]-arr[0]) + Math.abs(arr[0] -arr[2]);
            int sum4 =  Math.abs(arr[1]-arr[2]) + Math.abs(arr[0] -arr[2]);
            int sum5 =  Math.abs(arr[2]-arr[0]) + Math.abs(arr[0] -arr[1]);
            int sum6 =  Math.abs(arr[2]-arr[1]) + Math.abs(arr[0] -arr[2]);
           


            int result = Math.min(sum1 , sum2);
            result = Math.min(result , sum3);
            result = Math.min(result , sum4);
            result = Math.min(result , sum5);
            result = Math.min(result , sum6);
            
           System.out.println(result);
        }
    }
