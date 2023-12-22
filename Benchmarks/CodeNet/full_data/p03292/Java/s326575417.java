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
                int[]a=new int[3];
                for(int i=0;i<3;i++){
                        a[i]=sc.nextInt();
                }
                Arrays.sort(a);
                System.out.println(Math.abs(a[1]-a[0])+Math.abs(a[2]-a[1]));
                
                
                


                
        }
        
        
        

		
	
}
