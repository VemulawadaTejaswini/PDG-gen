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
                int[]a=new int[N];
                int sum=0;
                for(int i=0;i<N;i++){
                        a[i]=sc.nextInt();
                }
                int iro=a[0];
                for(int i=1;i<N;i++){
                        if(iro==a[i]){
                                sum++;
                                iro=N+1;
                        }else{
                        iro=a[i];}
                }
                System.out.println(sum);
                


                
        }
        
        
        

		
	
}
