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
          long M=sc.nextLong();
          ArrayList<Integer>list=new ArrayList<>();
          for(int i=1 ; i*i<=M ; ++i){
		          if(M%i == 0){
			            list.add(i);
			            if(i!=1 && i*i!=M)
			            {
				          list.add((int)M/i);
			}
		}
	        }
          long max=0;
          for(long i:list){
            if(i>max){
              long x=i*N;
              if(x<=M){
                max=i;
              }
            }
            
          }
          System.out.println(max);



          
    }






                



        }


