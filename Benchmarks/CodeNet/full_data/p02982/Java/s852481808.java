import java.util.*;
class Main{
	public static void main(String[] args){
    
    	Scanner s = new Scanner(System.in);
        int n = s.nextInt() , d = s.nextInt();
      	long[][] arr = new long[n][d];
      
      	for(int i = 0;i < n;i++){
        	for(int j = 0;j < d;++j){
            	arr[i][j] = s.nextLong();
            } 
        } 
      
      int count = 0;
      long ans = 0;
    
      for(int i = 0;i < n;i++){
      
      	for(int j = i + 1;j < n;j++){
        
          long val = 0;
        	for(int k = 0;k < d;++k){
            	val += Math.pow( (arr[j][k] - arr[i][k]) , 2 ); 
            }
          
          long a = (long)Math.sqrt(val);
          if(a*a == val) count++;
        
        }
      
      }
      
      System.out.println(count);
      
    }
  
}