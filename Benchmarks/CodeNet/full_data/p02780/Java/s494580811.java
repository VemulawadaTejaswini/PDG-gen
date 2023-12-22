import java.util.*;
public class Main {
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	// 整数の入力
	int n = sc.nextInt();
	int k = sc.nextInt();
	int p[] = new int[n];
	for (int i = 0; i < n; i++) {
		p[i] = sc.nextInt();
	}
	double res[] = new double[n-k+1];

	for (int i = 0; i < res.length; i++) {
	  for (int j = 0; j < k; j++) {
        res[i]+=(1.0+p[i+j])/2.0;
	  }
	}

    double f = res[0];
    for (int j = 1; j < res.length; j++) {
      if (res[j]>f) {
      	f=res[j];
      }
    }
	System.out.println(f);
  }
}

