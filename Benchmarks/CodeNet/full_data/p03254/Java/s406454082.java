import java.util.*;

public class Main{
	public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = sc.nextInt();
        
        String[] a = new String[N];
        
        for(int i = 0;i<N;i++){
        	a[i] = sc.next();
        }
        sc.close();
        
        Arrays.sort(a);
        
      int sum = 0;   
      int cnt = 0;

        if (Integer.parseInt(a[0]) <= x) {
        	for(int i = 0;i<N;i++){
        		sum += Integer.parseInt(a[i]);
            	cnt += 1;
            	if(sum == x){
           			break;
            	}
        	}
		   if (sum < x){
    	   	cnt -= 1; 
       	   }
        }
      
      
       System.out.println(cnt);

	}
}