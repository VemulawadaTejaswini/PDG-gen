import java.awt.Point;
import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Collection;



public class Main{

        static final Scanner sc=new Scanner(System.in);






        public static void main(String[]args){
          int N=sc.nextInt();
          int T=sc.nextInt();
          int[]c=new int[N];
          int[]t=new int[N];
          for(int i=0;i<N;i++){
            c[i]=sc.nextInt();
            t[i]=sc.nextInt();
          }
          int min=10000;
          for(int i=0;i<N;i++){
            if(t[i]<=T){
              if(min>c[i]){
                min=c[i];
              }
            }
          }
          if(min==10000){
            System.out.println("TLE");
          }else{
            System.out.println(min);
          }
                
    }






                



        }



