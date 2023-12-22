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
                int M=sc.nextInt();
                int X=sc.nextInt();
                int Y=sc.nextInt();
                int[]x=new int[N];
                int[]y=new int[M];
                for(int i=0;i<N;i++){
                        x[i]=sc.nextInt();
                }
                for(int i=0;i<M;i++){
                        y[i]=sc.nextInt();
                }
                Arrays.sort(x);
                Arrays.sort(y);
                boolean ok=false;
                for(int i=X+1;i<=Y;i++){
                        if((y[0]>=i)&&(x[N-1]<i)){
                                ok=true;

                        }
                }
                if(ok){
                        System.out.println("No War");
                }else{
                        System.out.println("War");
                }
                

                


                



        }








        
        private static int gcd(int m, int n) {
                if(m < n) return gcd(n, m);
                if(n == 0) return m;
                return gcd(n, m % n);
            }






}
