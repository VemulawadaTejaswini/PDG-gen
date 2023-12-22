import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    String str = sc.next();
    //Character s[] = new Character[n];
    char[] s = str.toCharArray();
	int q = Integer.parseInt(sc.next());
    int t = 0;
    int l = 0;
    int r = 0;
    int g = 0;
    char c;
	
    int k[] = new int[26];
    int sy[] = new int[26];
    int cc = 0;
    for(int i=0; i<n; i++){
      //cc = s.charAt(i) - 'a' + 1;
      cc = s[i] - 'a' + 1;
      k[cc-1]++;
    }
    
    int an = 0;
    for(int i=0; i<q; i++){
      an = 0;
      t = Integer.parseInt(sc.next());
      if(t==1){
        g = Integer.parseInt(sc.next());
        c = sc.next().charAt(0);
        s[i] = c;
      }
      if(t==2){
        Arrays.fill(sy, 0);
        l = Integer.parseInt(sc.next());
        r = Integer.parseInt(sc.next());
        for(int j=l-1; j<=r-1; j++){
          sy[s[j]-'a']++;
        }
        for(int jj=0; jj<26; jj++){
          if(sy[jj]!=0){
            an++;
          }
        }
        System.out.println(an);
      }
    }
    
  }
}
