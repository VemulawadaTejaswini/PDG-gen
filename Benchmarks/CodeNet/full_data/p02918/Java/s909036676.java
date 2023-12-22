import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());
    String s = sc.next();
    String c = "";
    int d[] = new int[n];
    int cnt = 0;
    int same = 0;
    int ans = 0;
    int ss = 0;
    
    for (int i=0; i<n-1; i++) {
      c = s.substring(i,i+1);
      d[i] = (c.equals("L")) ? -1 : 1;
    }
    
    for (int i=1; i<n; i++) {
      if(d[i] == 1){
        if(ss == 0) {
          ss++;
          same++;
          continue;
        }
        if(d[i] == d[i-1]) {
          same++;
        } else {
          for (int j=0; j<=same; j++){
            d[i-j] *= -1;
          }
          ss = 0;
          same = 0;
          cnt++;
          if(cnt == k) {
            same = 0; 
            break;
          }
        }
      }
      
    }

    for (int i=1; i<n; i++) {
      if(d[i] == d[i-1]){
        same++; 
      } else {
        ans += same;
        same = 0;
      }
      //System.out.print(d[i] == -1 ? "L" : "R");
    }
    
    System.out.println(ans);
  }
}
