import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner (System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int[] red = new int[a];
        int[] gre = new int[b];
        int[] col = new int[c];
        for(int i=0;i<a;i++) red[i] = in.nextInt();
        for(int i=0;i<b;i++) gre[i] = in.nextInt();
        for(int i=0;i<c;i++) col[i] = in.nextInt();
        int pta = a-1;
        int ptb = b-1;
        int ptc = c-1;
        
        Arrays.sort(red);
        Arrays.sort(gre);
        Arrays.sort(col);
        
        long sum=0L;
        for(int i=0;i<x;i++){
            if(ptc>=0 && col[ptc]>red[pta]){
                sum+=col[ptc];
                ptc--;
            }else{
                sum+=red[pta];
                pta--;
            }
        }
        for(int i=0;i<y;i++){
            if(ptc>=0 && col[ptc]>gre[ptb]){
                sum+=col[ptc];
                ptc--;
            }else{
                sum+=gre[ptb];
                ptb--;
            }
        }
        
        System.out.println(sum);
        
    }
}