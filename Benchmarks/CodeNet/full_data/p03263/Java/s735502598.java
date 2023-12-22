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
                int H=sc.nextInt();
                int W=sc.nextInt();
                int[][]a=new int[H][W];
                ArrayList<Integer>y=new ArrayList<>();
                ArrayList<Integer>x=new ArrayList<>();
                ArrayList<Integer>yy=new ArrayList<>();
                ArrayList<Integer>xx=new ArrayList<>();
                int N=0;
                for(int i=0;i<H;i++){
                        for(int j=0;j<W;j++){
                                a[i][j]+=sc.nextInt();
                                if(a[i][j]%2==1){
                                        if(j!=W-1){
                                        a[i][j]--;
                                        a[i][j+1]++;
                                        N++;
                                        y.add(i);
                                        x.add(j);
                                        yy.add(i);
                                        xx.add(j+1);}
                                        else if(i!=H-1){
                                        a[i][j]--;
                                        a[i+1][j]++;
                                        N++;
                                        y.add(i);
                                        x.add(j);
                                        yy.add(i+1);
                                        xx.add(j);

                                        }else{}

                                }
                        }
                }
              

                System.out.println(N);
                for(int i=0;i<N;i++){
                System.out.print(x.get(i)+1+" ");
                System.out.print(y.get(i)+1+" ");
                System.out.print(xx.get(i)+1+" ");
                System.out.println(yy.get(i)+1+" ");

        }

                


                


                
        }
        private static int gcd(int m, int n) {
                if(m < n) return gcd(n, m);
                if(n == 0) return m;
                return gcd(n, m % n);
            }
        
        
        

		
	
}
