
import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
	Scanner w = new Scanner ( System.in) ;
	int n = w.nextInt()
; 
	boolean flag = true; 
	long [] arr = new long [n];
	int i = 0 ; 
	
	while(i < n ) { 
		arr[i]=w.nextLong();
		i++;
	}
	i = 0 ;
	while (i < n) { 
		
		int j = 0;
		while (j < n) {
		if (i == j ) { 
			j++;
		}
		
		else {
			
			if (arr[i]==arr[j]) { 
				flag = false; 
			}
		j ++ ; 
		}
		
		}
		i ++ ; 
				
	}
	
	if (flag) { 
		System.out.println("YES");
		
	}
	else { 
		System.out.println("NO");
	}
	}
}
