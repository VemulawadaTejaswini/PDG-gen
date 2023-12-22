import java.util.*;
 
public class Main{
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
        int b[] =new int[n -1];
		for(int i = 0; i < n - 1; i++){
			b[i] = sc.nextInt();
        }
        int a[] =new int[n - 2];
        int total = b[0] + b[n - 2];
		for(int i = 0; i < (n - 2); i++){
			if(b[i] < b[i + 1]){
            	a[i] = b[i];
            }else if(b[i] >= b[i + 1]){
            	a[i] = b[i + 1];
            }
        }
        
        for(int i = 0; i < n - 2; i++){
        	total += a[i];
        }
        System.out.println(total);
	}
}