import javax.print.DocFlavor;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        //int[] dp = new int[3];
        int[] dp1 = new int[3];
        while(N>0){
            N--;
            String[] list = reader.readLine().split(" ");
            int a1 = Integer.parseInt(list[0]);
            int a2 = Integer.parseInt(list[1]);
            int a3 = Integer.parseInt(list[2]);
            int dp10 = dp1[0];
            int dp11 = dp1[1];
            int dp12 = dp1[2];
            dp1[0] = Math.max(dp12+a1,dp11+a1);
            dp1[1] = Math.max(dp10+a2,dp12+a2);
            dp1[2] = Math.max(dp10+a3,dp11+a3);
            //dp = dp1;
        }
        int max = dp1[0];
        for(int u=0;u<3;u++){
            if(max<dp1[u]) max = dp1[u];
        }
        System.out.println(max);
    }
}

