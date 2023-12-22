import java.util.*;

public class Main{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int K = sc.nextInt();
		
		int i = A;
                int j = B-K+1;
                if(j<i){
                	j=i;
                }
                while(i<A+K && i<j){
                	System.out.println(i);
                	i++;
                }
                while(j <= B){
                	System.out.println(j);
                	j++;
                }
	}	
}