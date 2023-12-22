import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[][] a = new int[n][2];
        for(int i=0;i<n;i++){
            a[i][0] = Integer.parseInt(sc.next());
            a[i][1] = i+1;
        }
        Arrays.sort(a,new Comparator<int[]>(){

            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });

        StringJoiner sj = new StringJoiner(" ");
        for(int i=0;i<n;i++){
            sj.add(String.valueOf(a[i][1]));
        }
        System.out.println(sj.toString());
        sc.close();
    }
    
}