import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        String s 	   = sc.next();
      	String[] sArray = s.split("");
        for(int i = 0 ; i < sArray.length()-1 ; i++){
        	if(sArray[i] == sArray(i+1)){
            	System.out.println("Bad");
                break;
            }
            if(i == sArray.length()-2){
            	System.out.println("Good");
            }
        }
    }
}

