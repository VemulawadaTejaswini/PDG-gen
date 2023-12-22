import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] a = new int[N];
        
        for(int i = 0; i < N; i++) {
        	
        	a[i] = Integer.parseInt(sc.next());
        }
        
        sc.close();
        
        int index = 0;
        int count = 0;
        int lineNumber = 1;
        
        while (index < N) {
        	
        	if(a[index] == lineNumber) {
        		
        		lineNumber++;
        	} else {
        		
        		count++;
        	}
        	
        	index++;
        }
        
        if(lineNumber < 2) {
        	
        	count = -1;
        }
        
        System.out.print(count);
    }
}