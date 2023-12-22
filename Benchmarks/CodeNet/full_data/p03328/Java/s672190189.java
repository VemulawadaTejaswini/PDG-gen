
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PARUL
 */
public class stoneMonument {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
    
        int b = in.nextInt();
        int arr[]=new int[1000];
        arr[0]=0;
        for (int i = 1; i <= 999; i++) {
            arr[i]=arr[i-1]+i;
        }
        int a1=0,b1;
        b1 = 0;
        for (int i = 1; i <= 999; i++) {
            if(arr[i]>=a){
                 a1=arr[i];
                 b1=arr[i+1];
                  break;
            }
        }
//        for (int i = 1; i <1000; i++) {
//            System.out.print(arr[i]+" ");
//        }
            System.out.println(a1-a);
    }
}
