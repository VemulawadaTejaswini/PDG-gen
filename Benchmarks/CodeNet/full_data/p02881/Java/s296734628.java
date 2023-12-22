import java.util.*;
public class Main{
	public static void main(String [] args){
	    Scanner sc = new Scanner(System.in);	
      long a = sc.nextLong();
      long x = 1;
      long y = 1;
      for(long i = 2; i-1 < a/2; i++){
          while ( a != 0 && a % i == 0){
            System.out.println(a);
            a = a/i;
            if( x <= y ){
              x = x*i;
            }else{
              y = y*i;
            }
            System.out.println(x+" "+y);
            
          }
        }
        if(x == 1 && y == 1){
            x = a;
        }
      System.out.println(x+y-1);
    }


}