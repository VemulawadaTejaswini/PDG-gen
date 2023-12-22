import java.util.*;

public class Main{
	public static void main(String[]args){
    	Scanner scan = new Scanner(System.in);
      	int n = scan.nextInt();
      	int x = scan.nextInt();
      	int[] l = new int[n];
      	int[] d = new int[n+1];
      	d[0] = 0;
      	for(int i = 0; i<n; i++){
        	l[i] = scan.nextInt();
        }
      	int counter = 0;
      	for(int i = 0; i < n;i++){
        	if(d[i] + l[i] < x){
            	counter++;
            }
          	d[i+1] = d[i] + l[i];
        }
      	System.out.print(counter);
    
    }

}