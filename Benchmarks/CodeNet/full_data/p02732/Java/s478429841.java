import java.util.*;
public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
  	int N = sc.nextInt();
  	int[] a = new int[N];
  	int[] freq = new int[N];

  	for(int i=0;i<N;i++) {
      a[i] = sc.nextInt();
      freq[a[i]-1] = freq[a[i]-1] + 1;
    }
  //  System.out.println(Arrays.toString(freq));

  	int[] ans = new int[N];
	int cnt;
  	for(int k=1;k<=N;k++){
      freq[a[k-1]-1]--;
      cnt = 0;
      for(int t=0;t<N;t++){
        cnt = cnt + (freq[t]*(freq[t]-1))/2;
      }
      ans[k-1] = cnt;
      freq[a[k-1]-1]++;
    }
  	for(int y=0;y<N;y++) System.out.println("" + ans[y]);
}
}
