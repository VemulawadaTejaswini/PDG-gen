import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	String s = scan.next();
      	int counter = 0;
      	for(int i = 0; i < 3 ; i ++){
        	if(s.charAt(i) == s.charAt(i + 1)){
              counter++;
            }
        }
      if(counter >= 1){
      	System.out.print("Bad");
      }
      else{
      	System.out.print("Good");
      }
    
    }

}