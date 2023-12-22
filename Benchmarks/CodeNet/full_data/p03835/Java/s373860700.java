import java.util.*;

public class Main {
	public static void main(String[] args) {  
  		Scanner sc = new Scanner(System.in);
      	int max = sc.nextInt();
      	int target = sc.nextInt();
      	int count = 0;
      	
      	for(int x = 0; x <= max; x++) {
			for(int y = 0; y <= max; y++) {
            	for(int z = 0; z <= max; z++) {
                  	int total = x + y + z;
                	if(total == target) count++;
                }
            }
        }
      	System.out.println(count);
    }
}