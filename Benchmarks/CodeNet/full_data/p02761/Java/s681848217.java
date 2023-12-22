import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.jar.Attributes.Name;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int m = sc.nextInt();
        int[] v = new int[n];
        Arrays.fill(v, -1);
        for(int i =0;i<m;i++){
            int s = sc.nextInt()-1;
            int c = sc.nextInt();
            if(v[s]<=0){
                v[s] = c;
            }else if(v[s]!=c){
                sc.close();
                System.out.println(-1);
                return;
            }
        }
        if(n!=1 && v[0]==0){
            System.out.println(-1); 
            return;  
        }
        for(int i=0;i<m;i++){
            if(v[i] == -1){
                if(n==1 && i==0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }else{
                System.out.print(v[i]);
            }
        }

        
    }
}

