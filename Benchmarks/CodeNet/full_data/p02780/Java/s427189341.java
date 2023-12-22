import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        Integer[] p = new Integer[n];
        for(int i = 0; i < n; i++) p[i] = scan.nextInt();
        int index = -1;
        int max = 0;
        int cmax = 0;
        for(int i = 0; i < n - k + 1; i++){
            for(int j = 0; j < k; j++){
                cmax += p[i + j];
            }
            if(max < cmax){
                max = cmax;
                index = i;
            }
            cmax = 0;
        }
        double out = 0;
        for(int i = index; i < index + k; i++){
            out += (double)(p[i] + 1) / 2;
        }
        System.out.println(out);
        scan.close();
    }
}