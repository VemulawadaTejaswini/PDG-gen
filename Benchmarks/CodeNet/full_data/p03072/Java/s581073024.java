import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] a = new int[n];
		for(int i=n-1; i>=0; i--){
			a[i] = scn.nextInt();
		}
      	int count = 1;
      	for(int i=1; i<n; i++){
          if(a[i]>=a[i-1]){
            count++;
          }else break;
        }
      	System.out.println(count);
	}
}