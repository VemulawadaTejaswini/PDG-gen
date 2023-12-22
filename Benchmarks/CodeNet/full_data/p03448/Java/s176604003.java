import java.util.*;

public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int a sc.nextInt();  
      int b sc.nextInt();  
      int c sc.nextInt();  
      int x sc.nextInt();  
      
      int count=0;
      boolean flag100 = true;
      boolean flag50 = true;
      
      for(int i = 1; i<=a ; i++){
       if(x % (500*i) == 0){
      	count += 1;
       }
        for(int j = 1; j<=b ; j++){
         if(flag100){        
            if(x % (100*j) == 0){
         	    count += 1;
         	    flag100 = false;
            }
         }
         
         if(x % (500*i + 100*j) == 0){
            count += 1;
         }
        	for(int k = 1; k<=c ; k++){
        	    if(flag50){
         		    if(x % (50*k) == 0){
         			    count += 1;
         			    flag50 = false;
        		    }
        	     }
        		 if(x % (500*i + 50*k) == 0){
            		count += 1;
         	     }else if(x % (500*i + 100*j + 50*k) == 0){
            		count += 1;
         	     }     		         
             }   
         }
      }
    System.out.println(count);
  }
}