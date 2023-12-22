import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int arr[][]=new int[n][d];
        for (int i=0;i<n;i++){
            for (int j=0;j<d;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int cnt=0;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                int sum=0;
                for (int k=0;k<d;k++){
                    sum+=((arr[i][k]-arr[j][k])*(arr[i][k]-arr[j][k]));
                }
                int tmp=sum;
                int sqrt=(int)Math.sqrt(tmp);
                if (sqrt*sqrt==sum){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);



    }

}

