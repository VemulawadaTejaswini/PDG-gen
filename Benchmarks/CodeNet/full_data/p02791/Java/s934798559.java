import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
      
      	int ns[] = new int[n];
      	int min;
      	int nc = 1;
      	boolean edge;
      	boolean edge2 = true;
      
      	for(int i = 0; i < n; i++) ns[i] = sc.nextInt();
      
      	min = ns[0];
      
      	if(min != 1){
      	for(int i = 0; i < n && edge2;i++){
          edge = true;
          if(ns[i] == 1){
            nc++;
            edge2 = false;  
          } else if(min > ns[i]){
            nc++;
            min = ns[i];
          }
         }
        }
        
		
      	System.out.println(nc);
        
	}
}