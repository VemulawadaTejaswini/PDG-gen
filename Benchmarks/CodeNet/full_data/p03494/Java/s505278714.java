import java.util.*;

public class Main {
	public static void main(String[] args) {  
  		Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
      	int[] ary = new int[N];
      	boolean hasOdd = false;
      
      	for(int i = 0; i < N; i++) {
        	ary[i] = sc.nextInt();
          	if(ary[i] %2 == 1) hasOdd = true;
        }
      	if(hasOdd) {
        	System.out.println(0);  
        } else {
          	int min = Integer.MAX_VALUE;
			for(int i : ary) {
              	int count = 0;
           		while(i %2 == 0) {
                	i /= 2;
                  	count++;
                }
              	if(count < min) min = count;
            }
          	System.out.println(min);
        }
    }
}