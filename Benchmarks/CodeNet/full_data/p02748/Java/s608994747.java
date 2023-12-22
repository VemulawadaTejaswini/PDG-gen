

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int m=s.nextInt();
        int aa[]=new int[a];
        int bb[]=new int[b];
        for(int j=0;j<a;j++){
            aa[j]=s.nextInt();
        }
        for(int j=0;j<b;j++){
            bb[j]=s.nextInt();
        }
        int min=Integer.MAX_VALUE;
        for(int j=0;j<m;j++){
            int x=s.nextInt();
            int y=s.nextInt();
            int c=s.nextInt();
            if(min>aa[x-1]+bb[y-1]-c){
                min=aa[x-1]+bb[y-1]-c;
            }
        }
        Arrays.sort(aa);
        Arrays.sort(bb);
        if(min>aa[0]+bb[0]){
            min=aa[0]+bb[0];
        }
        System.out.println(min);
    }
}
