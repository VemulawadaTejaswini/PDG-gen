import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());
    int s[][] = new int[m][n];
    int pat[] = new int[n];
    int k[] = new int[m];
    int p[] = new int[m];
    int ans = 0;

    for (int i=0; i<m; i++){
      k[i] = Integer.parseInt(sc.next());
      for(int j=0; j<k[i]; j++){
        s[i][j] = Integer.parseInt(sc.next());
      }
    }

    for(int i=0; i<m; i++){
      p[i] = Integer.parseInt(sc.next());
    }

    for(int i=0; i<Math.pow(2, n); i++){
      String bin = Integer.toBinaryString(i);
      
      if(bin.length() < n){
        for(int j=bin.length(); j<n; j++){
          bin = "0" + bin;
        }
      }
      
      //System.out.println(bin);
      
      for(int j=0; j<n; j++){
        pat[j] = Integer.parseInt(bin.substring(j,j+1));
      }
      
      int tdon = 0;
      for(int kk=0; kk<m; kk++){ // 電球
        int tson = 0;
        for(int ll=0; ll<k[kk]; ll++){ // スイッチ
          tson += pat[s[kk][ll]-1];
        }
        if(tson%2 == p[kk]) {
          tdon++;
        }
      }
      if(tdon == m){
        ans++;
      }
    }
    
    System.out.println(ans);
    
  }
}
