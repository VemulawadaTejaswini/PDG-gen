import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int n = scan.nextInt();
      	int q = scan.nextInt();
        HashMap<Integer, Integer> ls = new HashMap<>();	
      	for(int i = 1; i < n; i ++){
          	int pare = scan.nextInt();
          	int chir = scan.nextInt();
          	ls.put(chir, pare);
            }
      	int[] c = new int[n + 1];
      	c[0] = 0;
      	for(int i = 1; i <= q; i ++){
        	int p = scan.nextInt();
          	int x = scan.nextInt();
          	c[p] +=  x;
        }
      	System.out.print(c[1] + " ");
      	for(int j = 2; j <= n; j ++){
          	c[j] += c[ls.get(j)];
        	System.out.print(c[j] + " ");
        }
        }
    }