import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	string s = scan.next();
      	int counter = 0;
      	if(s[0] == "o"){
        	counter++;
        }
      	if(s[1] == "o"){
        	counter++;
        }
      	if(s[2] == "o"){
        	counter++;
        }
      	System.out.print(700 + counter * 100);
    }
}