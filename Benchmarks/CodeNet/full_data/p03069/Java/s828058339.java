import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int N = scan.nextInt();
      	String s = scan.next();
      	int counterW = 0;
      	for(int i = 0; i < N; i++){
        	if(s.substring(i, i+1).contains(".") && counterB >0){
            	counterW++;
            }
        }
        int pointer = counterW;
      	int ans = counterW;
      	for(int i =0; i < N; i++){
        	if(s.substring(i, i+1).countains(".")){
            	pointer--;
            }
          	else{
            	pointer++;
            }
          	ans = Math.min(ans, pointer);
        }
      	System.out.print(ans);
    }
 
}