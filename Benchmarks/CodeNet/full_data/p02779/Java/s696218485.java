import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
      
      int a[] = new int[N];
      
      for(int i=0; i<N; i++){
      a[i] = sc.nextInt();
      }
      
      Arrays.sort(a);
      
      for(int j=0; j<N-1; j++){
      if(a[j]==a[j+1]){
        System.out.println("No");
        return;
      }
      }
      System.out.println("Yes");
    }
}