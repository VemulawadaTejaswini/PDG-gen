import java.util.*;

public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] num = new int[n];
        int[] num2 = new int[n];
        int b1, b2;
        
        for(int i=0; i<n; i++){
        	num[i] = Integer.parseInt(sc.next());
        	num2[i] = num[i];
        }
        
        Arrays.sort(num2);
        b1 = num2[n/2 - 1];
        b2 = num2[n/2];
        
        for(int i=0; i<n; i++){
        	if(num[i] <= b1){
        		System.out.println(b2);
        	}else{
        		System.out.println(b1);
        	}
        }
        sc.close();
    }
}
	
	