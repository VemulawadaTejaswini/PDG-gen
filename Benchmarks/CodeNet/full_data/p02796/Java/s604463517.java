import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int x[] = new int[n];
      int l[] = new int[n];

      int count = 0;

      for (int i = 0;i<n ;i++ ) {
        x[i] = sc.nextInt();
        l[i] = sc.nextInt();
      }

      for(int i = 0; i < x.length - 1; i++){
  			int min = i;
  			for(int j = i + 1; j < x.length; j++){
  				if(x[j] < x[min]){
  					min = j;
  				}
  			}
  			int temp = x[i];
  			x[i] = x[min];
  			x[min] = temp;
        int temp2 = l[i];
        l[i] = l[min];
  			l[min] = temp2;
  		}

      for (int i = 0;i<n-1 ;i++ ) {
        if (x[i]+l[i]-1>x[i+1]-l[i+1]) {
          count++;
        }
      }
      System.out.println(n-count);

  }
}
