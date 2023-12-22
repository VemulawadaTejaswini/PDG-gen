	import java.util.*;
	 
	class Main{
	  public static void main(String[] args){
	    
	 
	Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
        int X[]　= new int[N];
        for (int i = 0; i < N ; i++){
  			X[i] = sc.nextInt();
        }
        for (int i = 0; i < N ; i++){
  			if (X[i]%2 == 0){
              if (X[i]%3 != 0 || X[i]%5 != 0){
                System.out.println("DENIED");
                break;
              }
            else 
                System.out.println("APPROVED");
            } 
        }
        
	  }
	}

