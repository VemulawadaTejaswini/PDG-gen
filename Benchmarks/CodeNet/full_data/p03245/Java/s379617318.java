
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n;
    static int x[];
    static int y[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        x = new int[n];
        y = new int[n];
        int max = 0;
        int mo = -1;
        for (int i = 0;i < n;++i){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            if(mo == -1)mo = (x[i] + y[i]) & 1;
            else if(mo != ((x[i] + y[i]) & 1)){
                System.out.println(-1);
                return;
            }
            int k = Math.abs(x[i]) + Math.abs(y[i]);
            if(max < k)max = k;
        }
        System.out.println(max);
        StringBuilder s = new StringBuilder();
        for (int i = 0;i < max;++i){
            s.append(1);
            if(i + 1 != max)s.append(' ');
        }
        System.out.println(s.toString());
        for (int i = 0;i < n;++i){
            StringBuilder sb = new StringBuilder();
            int k = Math.abs(x[i]) + Math.abs(y[i]);
            if(x[i] < 0){
                for (int j = 0;j < -x[i];++j){
                    sb.append('L');
                }
            }
            else{
                for (int j = 0;j < x[i];++j){
                    sb.append('R');
                }
            }
            if(y[i] < 0){
                for (int j = 0;j < -y[i];++j){
                    sb.append('D');
                }
            }
            else{
                for (int j = 0;j < y[i];++j){
                    sb.append('U');
                }
            }
            int u = max - k;
            u /= 2;
            for (int j = 0;j < u;++j){
                sb.append("LR");
            }
            System.out.println(sb.toString());
        }
    }



}



