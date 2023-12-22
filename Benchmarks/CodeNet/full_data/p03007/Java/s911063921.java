import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int m = scan.nextInt();
      	int[] a = new int[m];
      	for(int i = 0; i < m; i++){
        	a[i] = scan.nextInt();
        }
      	Arrays.sort(a);//-1 1 2
      	System.out.print(a[0]);
      	System.out.println(" " + a[1]);
      	for(int j = 2; j < m; j++){
          	System.out.print(a[j]);
          	int mi = a[j-2]-a[j-1];
          	System.out.println(" " + mi);
        }
    }
 
}