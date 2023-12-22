import java.util.*;

public class Main {
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    int cnt = 0;
	int n = sc.nextInt();
    boolean[] used = new boolean[n];
    int [][] red = new int [n][2];
    int [][] blue = new int [n][2];
    
    for(int i=0;i<n;i++){
      red[i][0] = sc.nextInt();
      red[i][1] = sc.nextInt();
    }
    
    for(int j=0;j<n;j++){
      blue[j][0] = sc.nextInt();
      blue[j][1] = sc.nextInt();
    }
    
    Arrays.sort(red, (x,y) -> x[1] - y[1]);
    Arrays.sort(blue, (x,y) -> x[0] - y[0]);
		for(int k=0; k<n; k++) {
			for(int l=n-1; l>=0; l--) {
				if(blue[k][0]>red[l][0]&&blue[k][1]>red[l][1]&&!used[l]) {
					cnt += 1;
					used[l] = true;
					break;
				}
			}
		}
		System.out.println(cnt);
    
  }
}