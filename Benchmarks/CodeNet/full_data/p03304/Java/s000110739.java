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
        static double n=sc.nextInt();
        static double m=sc.nextInt();
        static double d=sc.nextInt();
        
        
        
        
        
        public static void main(String[]args){
                double x=2/n;
                double y=2*d;
                double z=n*n;
                double yy=y/z;
                if(d!=0){
                System.out.println((x-yy)*(m-1));}
                else{
                        System.out.println((x-yy)*(m-1)/2);

                }

                
                
                

        }
        
        
        

		
	
}
