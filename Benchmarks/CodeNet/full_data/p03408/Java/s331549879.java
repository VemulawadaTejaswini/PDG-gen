import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
      	Map<String, Integer> map = new HashMap<>();
      	
      	Scanner sc = new Scanner(System.in);
      	sc.nextLine();
      	boolean isFirst = true;
    	while (sc.hasNextLine() && isFirst) {
      		String line = sc.nextLine();
         	if (isNumeric(line)){
            	isFirst = false;	
            }else{
          		map.merge(line, 1, Integer::sum);
            } 
          	
		}
      
      	while (sc.hasNextLine()) {
      		map.merge(sc.nextLine(), -1, Integer::sum);
		}
      
      	Integer m = 0;
      	for (Integer f : map.values()) {
    		if (f > m){
             	m = f;
            }  
		}
      	System.out.println(m);
    }
  
  	public static boolean isNumeric(String str){
  		return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
	}
}