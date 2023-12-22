import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int x = 0;
        int Sx = 0;
        for(int i=0; i<n; i++){
            if(i%2==0){
                if(Sx+a[i]<=0){
                    x += Math.abs(Sx + a[i]) + 1;
                    Sx = 1;
                }
                else{
                    Sx += a[i];
                }
            }
            else{
                if(Sx+a[i]>=0){
                    x += Math.abs(Sx + a[i]) + 1;
                    Sx = -1;
                }
                else{
                    Sx += a[i];
                }
            }
        }

        int y = 0;
        int Sy = 0;
        for(int i=0; i<n; i++){
            if(i%2==0){
                if(Sy+a[i]>=0){
                    y += Math.abs(Sy + a[i]) + 1;
                    Sy = -1;
                }
                else{
                    Sy += a[i];
                }
            }
            else{
                if(Sy+a[i]<=0){
                    y += Math.abs(Sy + a[i]) + 1;
                    Sy = 1;
                }
                else{
                    Sy += a[i];
                }
            }
        }
        System.out.println(Math.min(x, y));
    }
}