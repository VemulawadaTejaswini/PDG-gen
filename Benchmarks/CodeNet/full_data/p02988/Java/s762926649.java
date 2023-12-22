import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();    	
      	int[] p = new int[n];
      	int mid = 0;
      	int count = 1;
        for(int i = 0; i < a.length; ++i){
          p[i] = sc.nextInt();
        } 
        for(int i = 0; i <(n-2); i++){
            mid = p[(i+1)];
            if(mid > p[i] && mid < p[(i+2)]){
            count += 1; 
            }if(mid < p[i] && mid > p[(i+2)]){
            count += 1; 
            }
        }
       
      System.out.println(count);
    }
}
