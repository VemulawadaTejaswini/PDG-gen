import java.util.*;
import java.io.*;

public class Main{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //test cases
        int n = in.nextInt();
        int k = in.nextInt();
       
        //array input
        //int N = in.nextInt();
        int[] arr = new int[n];
        
        for(int i=0 ; i<n ; i++){
            arr[i] = in.nextInt();
        }
        // int step =0
        // int min = 0;
        // for(int i= 0; i<n i++){
        //     if(arr[i]<min) min = arr[i];
        // }
        // int index;
        // for(int i=0 ;i<n ;i++){
        //     if(arr[i]==min) {
        //         index = i;
        //         break;
        // }

        // for()

        int step = n/(k-1);
        System.out.println(step);
        
    }
}