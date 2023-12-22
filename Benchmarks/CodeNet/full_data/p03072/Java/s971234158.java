import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++){
			a[i] = scn.nextInt();
		}
      	int max = 0;
      	int count = 0;
      	for(int i=0; i<n; i++){
          if(a[i]>=max){
            count++;
            max=a[i];
          }
        }
      	System.out.println(count);
	}
}