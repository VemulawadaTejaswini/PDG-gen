import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = Integer.parseInt(sc.next());
	int b = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());
    int pa[] = new int[a];
    int pb[] = new int[b];
    int x[] = new int[m];
    int y[] = new int[m];
    int c[] = new int[m];
    int t = 0;
    int cc[][] = new int[a][b];

    for(int i=0; i<a; i++){
      pa[i] = Integer.parseInt(sc.next());
    }
    for(int i=0; i<b; i++){
      pb[i] = Integer.parseInt(sc.next());
    }
    for(int i=0; i<m; i++){
      x[i] = Integer.parseInt(sc.next());
      y[i] = Integer.parseInt(sc.next());
      c[i] = Integer.parseInt(sc.next());
    }
    
    for(int i=0; i<m; i++){
      if(cc[x[i]-1][y[i]-1] == 0 || c[i] > cc[x[i]-1][y[i]-1]){
		cc[x[i]-1][y[i]-1] = c[i];
      }
    }
    
    int ans = 1000000007;
    for(int i=0; i<a; i++){
      for(int j=0; j<b; j++){
        t = pa[i] + pb[j] - cc[i][j];
        if(t < ans) {
          ans = t;
        }
      }
    }
    
    System.out.println(ans);
    
  }
}
