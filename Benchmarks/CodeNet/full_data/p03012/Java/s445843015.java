import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
      	for (int i = 0; i<n; i++){
          a[i] = sc.nextInt();
        }
		int min = 10000;
      	int f = 0;
      	int l = 0;
      	int i = 0;
		for(int j = 0; j < n; j++){
          for (int k = 0; k<j; k++){
            f += a[k];
          }
          for (int m = j; m<n; m++){
            l += a[m];
          }
          if(min > Math.abs(f-l)){
            min = Math.abs(f-l);
          }
          f = 0;
          l = 0;
        }
		System.out.println(min);
	}
}