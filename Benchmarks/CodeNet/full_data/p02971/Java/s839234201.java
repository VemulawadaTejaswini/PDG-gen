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
        int input[]=new int[n];
        for (int i=0;i<n;i++){
            int x=sc.nextInt();
            input[i]=x;
        }
        int max=-1;
        int max2=-1;
        for (int i=0;i<n;i++){
            if (input[i]>=max){
                max2=max;
                max=input[i];
            }else if (input[i]>=max2){
                max2=input[i];
            }
        }
        for (int i:input){
            if (i==max) System.out.println(max2);
            else System.out.println(max);
        }



    }

}

