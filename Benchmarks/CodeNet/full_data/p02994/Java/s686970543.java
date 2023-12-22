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
        int l=sc.nextInt();
        int sum=0;
        int min=Integer.MAX_VALUE;
        int ind=0;
        for (int i=1;i<=n;i++){
            sum+=(l+i-1);
            if (Math.abs(l+i-1)<min){
                min=Math.abs(l+i-1);
                ind=i;
            }
        }
        System.out.println(sum-(l+ind-1));
    }

}

