import java.util.*;
 
public class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String step = sc.next();
      	for(int i = 0; i < step.length(); i++){
        	if(i%2 == 0){
            	if(step.charAt(i) == 'L'){
                	System.out.println("NO");
                  	break;
                }
            }else if(i%2 == 1){
            	if(step.charAt(i) == 'R'){
                	System.out.println("NO");
                  	break;
                }
            }
            if(i == step.length()-1){
            	System.out.println("YES");
            }
        }
      	
	}
}