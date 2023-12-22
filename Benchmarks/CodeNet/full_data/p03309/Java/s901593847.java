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
                int[]A=new int[N];
                for(int i=0;i<N;i++){
                        A[i]=sc.nextInt();
                }
                int[]B=new int[N];
                for(int i=1;i<N+1;i++){
                        B[i-1]=A[i-1]-i;
                }
                Arrays.sort(B);
                int x=B[N/2];
                int y=B[N/2];
                int minx=100;
                int miny=100;
                
                while(true){
                        int sum=0;
                        for(int i=0;i<N;i++){
                                sum+=Math.abs(B[i]-x);


                        }
                        if(sum<minx){
                                minx=sum;
                                
                        }
                        if(x<B[N-1]){
                                x++;
                        }else{
                                break;
                        }

                        
                }
                while(true){
                        int sum=0;
                        for(int i=0;i<N;i++){
                                sum+=Math.abs(B[i]-y);


                        }
                        if(sum<miny){
                                miny=sum;
                        }
                        if(y>B[0]){
                                y--;
                        }else{
                                break;
                        }
                        
                }
                System.out.println(Math.min(minx,miny));
                
        }
        
        
        

		
	
}
