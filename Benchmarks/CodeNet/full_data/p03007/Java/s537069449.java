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
      	int hi = a[0] - a[1];//-1 -1 = -2
      	for(int k = 2; k < m; k++){
        	int mi = a[k] - hi;//2- -  2 = 4
          	hi = mi;
        }
      	System.out.println(hi);
      	System.out.print(a[0]);
      	System.out.println(" " + a[1]);
      	for(int j = 2; j < m; j++){
          	System.out.print(a[j]);
          	int mi = a[j-2]-a[j-1];
          	System.out.println(" " + mi);
        }
    }
 
}