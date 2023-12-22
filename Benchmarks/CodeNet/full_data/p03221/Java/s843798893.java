import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
	int m = sc.nextInt();
	int p[] = new int[m+1];
	int y[] = new int[m+1];
	int[] sijun = new int[m+1];
	int[] kencnt = new int[m+1];
	for(int i = 1; i <= m; i++){
		p[i] = sc.nextInt();
		y[i] = sc.nextInt();
	}
	for(int i = 1; i <= m; i++){
		sijun[i] = 1;
		for(int j = 1; j <= m; j++){
			if(i != j){
				if(p[i] == p[j]){
					if(y[i] > y[j]){
						sijun[i]++;
					}
				}
			}
		}
	}
	for(int i = 1; i <= m; i++){
		System.out.printf("%012d\n",p[i] * 1000000 + sijun[i]);
	}
  }
}
