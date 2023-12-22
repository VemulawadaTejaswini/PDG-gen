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
                int T=sc.nextInt();
                for(int i=0;i<T;i++){
                        long A=sc.nextLong();
                        long B=sc.nextLong();
                        long C=sc.nextLong();
                        long D=sc.nextLong();
                        long E=D-B;
                        long hozon=0;
                        ArrayList<Long>kazoe=new ArrayList<>();
                        if(A<B){
                                System.out.println("No");
                        }else{
                                
                                        
                                
                                
                                for(;;){if(kazoe.size()>1000){
                                        long F=C-A;
                                        F=F/E;
                                        A=A+F*E;
                                        
                                }
                                if(kazoe.size()>6000){
                                        System.out.println("Yes");
                                        break;
                                }
                                        
                                        long X=A/B-1;
                                        if(X>0){
                                                A=A-B*X;

                                        }
                                        if(A<B){
                                                System.out.println("No");
                                                break;
                                        }else{
                                        if(A-B<=C){
                                                A=A-B+D;
                                                if(kazoe.contains(A)){
                                                        System.out.println("Yes");
                                                        break;
                                                }
                                                kazoe.add(A);
                                                hozon=A;
                                               
                                                
                                        }
                                        else{
                                                A=A-B;
                                                if(kazoe.contains(A)){
                                                        System.out.println("Yes");
                                                        break;
                                                }
                                                kazoe.add(A);

                                        }
                                       
                                }

                                }
                        }
                }
                
                


                
        }
        
        
        

		
	
}
