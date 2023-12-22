	import java.util.*;
	 
	class Main{
	  public static void main(String[] args){
	    
	 
	Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
        int x[];
        for (int i = 0; i < N ; i++){
  			x[i] = sc.nextInt();
        }
        for (int i = 0; i < N ; i++){
  			if (x[i]%2 == 0){
              if (x[i]%3 != 0 || x[i]%5 != 0){
                System.out.println("DENIED");
                break;
              }
            else 
                System.out.println("APPROVED");
            } 
        }
        
	  }
	}

