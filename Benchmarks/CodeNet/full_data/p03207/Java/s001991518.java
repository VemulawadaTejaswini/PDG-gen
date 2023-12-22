import java.util.*;
 
public class Main {
	
  	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] a = new int[N];
        for(int i = 0; i < N; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        sc.close();

        int max = 0, result = 0;
        for(int i = 0; i < N; i++){
            max = Math.max(max, a[i]);
            result += a[i];
        }
        
        System.out.println(result - max/2);
    }
}