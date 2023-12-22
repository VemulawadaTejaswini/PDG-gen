import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int c = sc.nextInt();
      int k = sc.nextInt();
      int[] t = new int[n];
      for(int i = 0;i < n;i++)t[i]=sc.nextInt();
      Arrays.sort(t);
      int cnt = 0;
      int sum = 0;
      for(int i = 0;i < n;){
        cnt = 0;
        int time = t[i];
      	while(i<n&&time+k>=t[i]&&cnt<c){
        	i++;
            cnt++;
        }
        sum++;
      }
      System.out.println(sum);
    }
}