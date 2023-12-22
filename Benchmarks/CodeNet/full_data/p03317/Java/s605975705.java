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
        static int N=sc.nextInt();
        static int K=sc.nextInt();
        static int[]A=new int[N];
        
        
        
        
        
        public static void main(String[]args){
                int ichi=0;
                for(int i=0;i<N;i++){
                        A[i]=sc.nextInt();
                        if(A[i]==1){
                                ichi=i;
                        }
                }
                int sum=0;
                int KK=K-1;
                if(ichi%KK==0){
                        sum+=ichi/KK;
                }else{
                        sum+=ichi/KK+1;
                }
                if((N-1-ichi)%KK==0){
                        sum+=(N-1-ichi)/KK;
                }else{
                        sum+=(N-1-ichi)/KK+1;
                }
                System.out.println(sum);
                


                
                

        }
        
        
        

		
	
}
