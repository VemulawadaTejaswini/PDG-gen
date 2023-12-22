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
                String S=sc.next();
                long K=sc.nextLong();
                int ichi=0;
                for(int i=0;i<S.length();i++){
                        if(S.charAt(i)=='1'){
                                ichi++;
                        }else{
                                break;
                        }
                }
                if((ichi>=K)){
                        System.out.println(1);
                }else{
                        System.out.println(S.charAt((int)ichi));
                }
                
                
                


                
        }
        
        
        

		
	
}
