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
        int step = (int)Math.ceil((float)(n)/(k-1));
        System.out.println(step);
        
    }
}