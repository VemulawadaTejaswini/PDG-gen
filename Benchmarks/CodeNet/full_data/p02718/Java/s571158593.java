import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int m = sc.nextInt();
    int[] a = new int[n];
    double sum = 0;
    for(int i = 0 ; i < n ; i++){
      a[i] = sc.nextInt();
      sum += a[i];
    }
      double min = sum / (4 * m);
      int num = n;
      for(int i = 0 ; i < n ; i++){
        if(a[i] < min)
          num--;
    }
    
      
	
	System.out.println(num >= m ? "Yes" : "No");
	}
}