import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int[] len = new int[n];
        for (int i=0; i<n; i++) {
        	len[i] = sc.nextInt();
        }

      Arrays.sort(len);
      
      int count = 0;
      
      for (int i=0; i<n-2; i++) {
        int a = len[i];
      	for (int j=i+1; j<n-1; j++) {
          int b = len[j];
          for (int k=j+1; k<n; k++) {
            int c = len[k];
            if (a+b<=c) {
              break;
            } else if (a<b+c && b<c+a) {
              count++;
            }
          }
        }
      }
      
      System.out.println(count);
	}
}