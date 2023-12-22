import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int[] len = new int[n];
        for (int i=0; i<n; i++) {
        	len[i] = sc.nextInt();
        }
		
      int count = 0;
      
      for (int i=0; i<n-2; i++) {
      	for (int j=i+1; j<n-1; j++) {
          for (int k=j+1; k<n; k++) {
          	if (len[i]<len[j]+len[k] 
                 && len[j]<len[k]+len[i] 
                 && len[k]<len[i]+len[j]) {
              count++;
            }
          }
        }
      }
      
      System.out.println(count);
	}
}