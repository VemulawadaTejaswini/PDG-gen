import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);		
		int N = in.nextInt();
        int mo[] = new int[N+1];
      
      for(int i = 0;i < N+1;i++){
      	mo[i] = in.nextInt(); 
      }
      
      int sum = 0;
      int yu = 0;
      
      for(int i =0;i < N;i++){
		yu = in.nextInt(); 
        
        if(yu>mo[i]){
        	sum += mo[i];
            yu  -= mo[i]; 
        	sum += Math.min(mo[i+1],yu);
            mo[i+1] = Math.max(0,mo[i+1]-yu); 
        }else{
          sum +=yu;
        }
      }
       System.out.print(sum); 
      }
	}