import java.util.*;
class Main{
  static int[] a;
  static int[] b;
  static Map<Integer, List<Integer> > aToPos = new HashMap<>();
  static boolean[] ban;
  public static int dfs(int v){
    int res = 1;
    ban[v]=true;
    for(int pos: aToPos.get(a[v])){
      if(!ban[pos]){
        res += dfs(pos);
      }
    }
    return res;
  }
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
  	a = new int[n+1];
    b = new int[n+1];
    for(int i=0;i<n;++i){
      a[i]=sc.nextInt();a[n]^=a[i];
    }
    for(int i=0;i<n;++i){
      b[i]=sc.nextInt();b[n]^=b[i];
    }
    int[] aa = new int[n+1];
    int[] bb = new int[n+1];
    for(int i=0;i<=n;++i)aa[i]=a[i];
    for(int i=0;i<=n;++i)bb[i]=b[i];
    Arrays.sort(aa);Arrays.sort(bb);
    for(int i=0;i<=n;++i)if(aa[i]!=bb[i]){
      System.out.println(-1);return;
    }
    ban = new boolean[n+1];
    for(int i=0;i<n;++i)if(a[i]==b[i])ban[i]=true;
    for(int i=0;i<=n;++i){
      if(i<n&&ban[i])continue;
      if(!aToPos.containsKey(b[i])){
        aToPos.put(b[i], new ArrayList<>());
      }
      aToPos.get(b[i]).add(i);
    }
    int ans = 0;
    if(a[n]==b[n] && aToPos.get(a[n]).size()==1){
      for(int i=0;i<n;++i)if(!ban[i]){
        ans += dfs(i)+1;
      }
    }else{
      ans += dfs(n)-1;
      for(int i=0;i<n;++i)if(!ban[i]){
        ans += dfs(i)+1;
      }
    }
    System.out.println(ans);
  }
}