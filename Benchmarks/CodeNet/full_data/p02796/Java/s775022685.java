import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[][] d = new int[n][2];
        int x,l;
        for(int i=0;i<n;i++){
            x = Integer.parseInt(sc.next());
            l = Integer.parseInt(sc.next());
            d[i][0] = x-l;
            d[i][1] = x+l;
        }
        sc.close();
        Arrays.sort(d,new Comparator<int[]>(){

            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }

        });
        int end = Integer.MIN_VALUE;
        int res = 0;
        for(int i=0;i<n;i++){
            if(d[i][0] >= end){
                res++;
                end = d[i][1];
            }
        }
        System.out.println(res);
    }
}