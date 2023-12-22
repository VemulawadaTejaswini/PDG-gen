import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
	int m = sc.nextInt();
	int p[] = new int[m+1];
	int y[] = new int[m+1];
	int[] sinum = new int[m+1];
	int kencnt[] = new int[n+1];
	for(int i = 1; i <= m; i++){
		p[i] = sc.nextInt();
		y[i] = sc.nextInt();
	}
	for(int i = 1; i <= n; i++){
		for(int j = 1; j <= m; j++){
			if(i == p[j]){
				kencnt[i]++;
			}
		}
	}
	for(int i = 1; i <= n; i++){
		for(int j = 1; j <= kencnt[i]; j++){
			System.out.printf("%012d\n",i*1000000+j);
		}
	}
  }
}
