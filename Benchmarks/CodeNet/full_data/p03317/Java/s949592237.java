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
                if((ichi!=0)&&((N-1)%ichi==0)&&((N-1)/ichi==2)){
                        sum++;
                        int hayaichi=ichi-(KK/2);
                        int osoichi=ichi+(KK/2);
                        if((hayaichi>=KK)&&(N-1-osoichi>=KK)){
                                if(hayaichi%KK==0){
                                        sum+=hayaichi/KK;
                                }else{
                                        sum+=hayaichi/KK+1;
                                }
                                if((N-1-osoichi)%KK==0){
                                        sum+=(N-1-osoichi)/KK;
                                }else{
                                        sum+=(N-1-osoichi)/KK+1;
                                }}else{
                                        if((N-1)%KK==0){
                                        sum=(N-1)/KK;}else{
                                                sum=(N-1)/KK+1;
                                        }
                
                                }

                }else if((ichi%KK+(N-1-ichi)%KK)>KK){
                        sum=(N-1)/KK;

                }else{


                if((ichi>=KK)&&(N-1-ichi>=KK)){
                if(ichi%KK==0){
                        sum+=ichi/KK;
                }else{
                        sum+=ichi/KK+1;
                }
                if((N-1-ichi)%KK==0){
                        sum+=(N-1-ichi)/KK;
                }else{
                        sum+=(N-1-ichi)/KK+1;
                }}else{
                        if((N-1)%KK==0){
                        sum=(N-1)/KK;}else{
                                sum=(N-1)/KK+1;
                        }

                }}
                System.out.println(sum);
                


                
                

        }
        
        
        

		
	
}
