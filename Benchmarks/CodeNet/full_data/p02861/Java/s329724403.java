import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[][] xy = new double[n][2];
        for(int i = 0;i<n;i++){
            xy[i][0] = sc.nextDouble();
            xy[i][1] = sc.nextDouble();
        }
        double result = 0;
        for(int i = 0;i<(n-1);i++){
            for(int j = (i+1);j<n;j++){
                result += Math.sqrt( (xy[i][0] - xy[j][0]) * (xy[i][0] - xy[j][0]) +
                (xy[i][1] - xy[j][1]) * (xy[i][1] - xy[j][1]) );
            }
        }
        result = result * 2 / n;
        System.out.println(result);
        sc.close();
    }
}