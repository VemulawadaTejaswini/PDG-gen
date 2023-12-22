import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
 
public class Main {
	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        	int a = scanner.nextInt();
          	List<int> split = Arrays.asList(a.split(""));
            
            int count = 0;
            for(int i = 0; i<3; i++){
            	if(split.get(i) == 1){
                	count += 1;
                }
            }    
      	
        System.out.println(count);
      
        }
}