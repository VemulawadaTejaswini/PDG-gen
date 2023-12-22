import java.util.Scanner;
import java.util.Arrays;

public class Main{

	public static void main(String args[]){
    	
      	Scanner sc = new Scanner(System.in);
      
        int n = sc.nextInt();
        int l = sc.nextInt();
      
        String ary[] = new String[n];
      
      	for(int i=0; i<n; i++){
        	ary[i] = sc.next();
        }
      
      	Arrays.sort(ary);
      
      	String answer = "";
      	for(int j=0; j<n; j++){
        	answer += ary[j];
        }
      
      	System.out.println(answer);
        
    }
}