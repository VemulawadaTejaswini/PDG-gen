import java.util.*;
 
public class Main {
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		String K = "keyence";
		String S = sc.nextInt();
        boolean fl = false;
        int l = S.length();
      	for(i=6;0<=i;i--){
        	if(S.substring(0,i)== K.substring(0,i)){
        		if(S.substring(l-(6-i))==K.substring(6-i)){
                	System.out.println("YES");
                  	return;
                }
            }
        
        }
      	if(!fl){
          System.out.println("NO");
        }
     } 
}  