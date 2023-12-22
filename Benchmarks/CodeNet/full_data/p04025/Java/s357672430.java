import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        int a[] = new int[N];
        int tf=0;
        int x1 =0;
        int x2 =0;
        for(int i = 0; i<a.length; i++){
            a[i] = input.nextInt();
        tf += a[i];
        }
        double v = (double)tf/N;
        int tf1 = (int)Math.ceil(v);
        int tf2 = (int)Math.floor(v);
        System.out.println(v);
        System.out.println(tf1);
        System.out.println(tf2);
        for(int i = 0; i<a.length; i++){
            x1+=Math.pow((a[i]-tf1), 2);
             x2+=Math.pow((a[i]-tf2), 2);
        }
         System.out.println((x1<x2)?x1:x2);
             
    }
}