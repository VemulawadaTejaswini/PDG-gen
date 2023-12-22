import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	    int digit = in.nextInt();
      	int inputs = in.nextInt();
      
      	if (inputs == 0) {
         	System.out.println(-1);          
         	return;          
        }
      
        int[] array = new int[digit];
		for (int i = 0; i < inputs; i++) {
          	int pos = in.nextInt();  
          	int val = in.nextInt();
          	array[pos - 1] = val;
        }      
      
      	if (array[0] == 0) {
         	System.out.println(-1);          
         	return; 
        }
      
      	StringBuilder sb = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
         	sb.append(array[i]); 
        }
 
      	System.out.println(sb.toString());
    }
 
}