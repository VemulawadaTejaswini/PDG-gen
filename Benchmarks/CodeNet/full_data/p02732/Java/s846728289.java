import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int[] numSumList = new int[n];
    int all = 0;
    
    for(int i = 0 ; i < n ; i++){
      a[i] = sc.nextInt();
      numSumList[a[i]] = numSumList[a[i]] + 1;
    }
      for(int i = 0 ; i < n ; i++){
        int j = numSumList[i];
        all += j * (j - 1) / 2;
	}
      for(int i = 0 ; i < n ; i++){
        int k = numSumList[a[i]];
        System.out.println(all - k * (k - 1) / 2 + (k - 1) * (k - 2) / 2);
      }
    }
}