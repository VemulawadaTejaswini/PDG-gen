import java.util.Scanner;
 
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[]H = new int[N];
    
    int see = 0;
    int cou = 0;
    for(int i=0; i<N; i++) {		
    	H[i] = sc.nextInt();
    	if(H[i] >= see) {
     		cou++;
    		see = H[i]; 
    	}		
    }
         System.out.println(cou);        
      }
}