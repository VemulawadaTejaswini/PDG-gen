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
                int D=sc.nextInt();
                int G=sc.nextInt();
                int[]p=new int[D];
                int[]c=new int[D];
                for(int i=0;i<D;i++){
                        p[i]=sc.nextInt();
                        c[i]=sc.nextInt();
                }
                int[]point=new int[D];
                for(int i=0;i<D;i++){
                        point[i]=100*(i+1)*p[i]+c[i];
                }
                int sum=0;
                int ima=D-1;
                int nokori=p[ima];
                for(;;){
                        
                        if(G<=0){
                                break;
                        }
                        
                        
                        for(int i=0;i<D;i++){
                                if(point[i]>=G){
                                if(p[i]<=p[ima]){
                                        if(point[i]>100*p[i]*(ima+1)){
                                                for(int j=0;j<=p[i];j++){
                                                        if(100*(ima+1)*j>=G){
                                                                break;
                                                        }
                                                        if(j==p[i]){
                                                                if(p[i]!=0){
                                                                ima=i;}
                                                                
                                                        }
                                                }
                                                
                                        }
                                }}
                                

                        }
                        sum++;
                        G=G-100*(ima+1);
                        p[ima]=p[ima]-1;
                        
                        
                        
                        if(p[ima]==0){
                                G=G-c[ima];
                                for(int i=D-1;i>=0;i--){
                                        if(p[i]!=0){
                                                ima=i;
                                                break;

                                        }
                                }
                                
                                
                        }
                        
                        
                                
                        


                }
                System.out.println(sum);
                

                
                
                
                


                
        }
        
        
        

		
	
}
