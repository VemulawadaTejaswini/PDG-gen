import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());
    int[] s = new int[m];
    int[] c = new int[m];
    for(int i = 0; i < m;i++){
      s[i] = Integer.parseInt(sc.next());
      c[i] = Integer.parseInt(sc.next());
      if(s[i] == 1 && c[i] == 0){
        System.out.println(-1);
        return;
      }
      for(int j = 0;j < i;j++){
        if((s[i]==s[j])&&!(c[i]==c[j])){
          System.out.println(-1);
          return;
        }
      }
    }
    int[] result = new int[n];
    for(int i = 0; i < n; i++){
      result[i] =0;
    }
    Map<Integer,Integer> ans = new TreeMap<Integer,Integer>();
    for(int i = 0; i < m; i++){
      ans.put(s[i],c[i]);
    }
    for(int key:ans.keySet()){
      if(key==1){
        result[0] = ans.get(key);
      }
      if(key==2){
        result[1] = ans.get(key);
      }
      if(key==3){
        result[2] = ans.get(key);
      }
    }
    for(int i=0; i < n;i++){
      System.out.print(result[i]);
    }
  }
}
