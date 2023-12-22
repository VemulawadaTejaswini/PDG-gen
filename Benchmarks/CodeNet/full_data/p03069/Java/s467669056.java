import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int N = scan.nextInt();
      	String s = scan.next();
      	int counterW = 0;
      	int counterB = 0;
      	int counterBlast = 0;
      	for(int i = 0; i < N; i++){
        	if(s.substring(i, i+1).contains(".")){
            	counterW++;
            }
          	else if(s.substring(i, i+1).contains("#")){
            	counterB++;
            }
        }
      	for(int j = N; j > 0; j--){
        	if(s.substring(j-1,j).contains("#")){
            	counterBlast++;
            }
        	else{
            	break;
            }
        }	
      
      
      	if(counterW < counterB - counterBlast){
        	System.out.print(counterW);
        }
      	else{
        	System.out.print(counterB - counterBlast);
        }
    
    }
 
}