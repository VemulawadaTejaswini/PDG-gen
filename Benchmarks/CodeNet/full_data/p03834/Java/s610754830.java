import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	String h = sc.next();
      	String haiku = "";
      	for(int i = 0; i < h.length(); i++){
        	if(h.charAt(i) == ','){
            	haiku += " ";
            }else{
            	haiku += h.charAt(i);
            }
        }
      	System.out.println(haiku);
    }
}