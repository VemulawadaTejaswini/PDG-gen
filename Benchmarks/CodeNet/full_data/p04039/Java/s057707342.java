import java.util.*;

public class Main {
	public static void main(String[] args) {		
          Scanner sc = new Scanner(System.in);      
            
          int N = sc.nextInt();

          int K = sc.nextInt();
          
          int a[] = new int[K]; 
          
          for(int i = 0;i < K;i++){
              a[i] = sc.nextInt();
          }
          
          for(int i = N;;i++){
              String str = String.valueOf(i);                        
              boolean flag = true;
              for(int j = 0;j < K;j++){
                  String k = String.valueOf(a[j]);  
                  if(str.contains(k)){
                      flag = false;
                  }
              }               
              if(flag){
                  System.out.println(i);
                  return;
              }
          }            
                                    
        }
}
        