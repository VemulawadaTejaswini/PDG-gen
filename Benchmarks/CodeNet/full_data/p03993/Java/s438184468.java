import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
  		int rabs[] = new int[s]; 
      	long stack_num;
      	long like = 0;
      	
      	for(int i = 0;i < s; i++){
        	rabs[i] = sc.nextInt();
        }
      
      	for(int i = 0; i < s;i++){ 
          if(rabs[rabs[i]-1] == (i + 1)) like++;
        }
 		
      	System.out.println(like/2);
        
	}
}
