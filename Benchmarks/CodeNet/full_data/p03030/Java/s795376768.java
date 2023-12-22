import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

class B{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        String[] s1 = new String[n];
        String[] s2 = new String[n]; 
        int[] p = new int[n];
        for(int i = 0;i < n;i++){
            s1[i] = scan.next();
            s2[i] = s1[i];
            p[i] = scan.nextInt();
        }
        Arrays.sort(s1);
        int[] point = new int[n];
        for(int i = 0;i < n;i++){
            point[i] = 0;
        }
        for(int i = 0;i < n;i++){
            int pointp = 0;
            int name = 0;
            for(int j = 0;j < n;j++){
                if(s1[i].equals(s2[j])){
                    if(pointp <= p[j] && point[j] == 0){
                        pointp = p[j];
                        name = j;
                    }
                }
            }
            point[name] = 1;
            System.out.println(name+1);
        }
    }   

}
