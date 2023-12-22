import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scan_A = new Scanner(System.in);
        int a = scan_A.nextInt();
        int b = scan_A.nextInt();
        int c = scan_A.nextInt();
        int d = scan_A.nextInt();
        int[] arr = new int[4];
        int ans;
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        arr[3] = d;
        if(b < c){
            ans = 0;
            System.out.println(ans);
        }else{
            Arrays.sort(arr);
            ans = arr[2] - arr[1];
            System.out.println(ans);
        }
        
    }

}