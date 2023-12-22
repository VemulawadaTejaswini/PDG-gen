import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
	public static void main(String[] args) throws ParseException{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      	int m = sc.nextInt();
      	int key[] = new int[m];
      	int key_b[] = new int[m];
      	int stack;
      	int count = 0;
      	
      
      	for(int i = 0; i < m;i++) {
          key[i] = 0;
          key_b[i] = 0;
        }
      
      	int k = sc.nextInt();
      
     	for(int i = 0; i < k;i++){
          key[i] = sc.nextInt();
          key_b[i] = 1;
        }
      
      	k = sc.nextInt();
      
      	for(int i = 1; i < n;i++){
          	k = sc.nextInt();
      		for(int j = 0; j < k;j++){
          		stack = sc.nextInt();
           		for(int x = 0; x < m;x++){
             		if(key[x] == stack && key_b[x] == 0) key_b[x] = i;  
           		}
              	for(int x = 0; x < m;x++){
             		if(key_b[x] != i) key_b[x] = 0;  
           		}              	
          	}
        }
      
      	for(int i = 0; i < m;i++){
        	if(key_b[i] == n-1) count++;
        }
      	
      
      	System.out.println(count);
      	
        
	}
}