import java.util.*;

public class Main {
	public static void main(String[] args) {  
  		Scanner sc = new Scanner(System.in);
  		int a = sc.nextInt();
      	int b = sc.nextInt();
      	int count = 0;
      
      	for(int i = 1; i <= a; i++) {
        	for(int j = 1; j <= b; j++) {
            	if(i == j) count++; 
            }
        }
      	System.out.println(count);
    }
}