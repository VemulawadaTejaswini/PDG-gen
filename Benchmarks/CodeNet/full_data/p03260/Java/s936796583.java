import java.util.Scanner;

public class Main {
    public static void main(String[] args){
 
    	Scanner sc = new Scanner(System.in);
        // 整数の入力
    		int a = sc.nextInt();
      		int b = sc.nextInt();

        int c1 = 1;
        int c2 = 2;
        int c3 = 3;    	
    	
        int a1 = a*b*c1;
        int b1 = a*b*c2;        		
        int cc1 = a*b*c3;
        
        int q[] = {1,3,5,7,9};
        
       	if(a1 == q[0|1|2|3|4] ) {
       		System.out.println("Yes");
       	}else if( b1 == q[0|1|2|3|4] ) {
           		System.out.println("Yes");
       	}else if( cc1 == q[0|1|2|3|4] ) {
       		System.out.println("Yes");
       	} else {
       		System.out.println("No");
         }

       	
        
    }

    }
