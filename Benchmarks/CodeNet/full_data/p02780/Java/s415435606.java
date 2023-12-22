import java.util.*;
public class Main {
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	// 整数の入力
	int n = sc.nextInt();
	int k = sc.nextInt();
	int p[] = new int[n];
	int p2[] = new int[n];
	for (int i = 0; i < n; i++) {
	  p[i] = sc.nextInt() + 1;
	}
	int max=0;
	p2[0]=p[0];
    for (int i = 1; i < n; i++) {
      if (i < k) {
      	p2[i]=p[i]+p2[i-1];
      }	else {
      	p2[i]=p[i]+p2[i-1]-p[i-k];
      }
      if (p2[i]>max) {
      	max=p2[i];
      }
    }
	System.out.println(max/2.0);
  }
}

