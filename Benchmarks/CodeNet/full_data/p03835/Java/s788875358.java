import java.util.*;
 
public class Main{
 
	public static void main(String[] args){
 
		Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int S = sc.nextInt();
        
        int count = 0;
        for(int i = 0; i <= K; i++){
          for(int j = 0; j <= K; j++){
            if(i+j == S){
              count++;
            }else{
              for(int k = K; k >= 0; k--){
                if(i+j+k == S){
                  count++;
                  break;
                }
              }  
            }
          }
        }
      
      
      
       System.out.println(count);
   }
}