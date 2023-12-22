import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char[] c = sc.next().toCharArray();
    int[] cnt = new int[26];
    Map<Character,Integer> map = new HashMap<>();
    Map<Integer,Character> map2 = new HashMap<>();
    int k=0;
    for(char x='a';x<='z';x++){
      map.put(x,k);
      map2.put(k,x);
      k++;
    }
    for(int i=0;i<c.length;i++)cnt[map.get(c[i])]++;
    for(int i=0;i<26;i++){
      if(cnt[i]==0){
        System.out.print(c.toString());
        System.out.println(map2.get(i));
        return;
      }
    }
    int idx = 0;
    for(int i=25;i>=1;i--){
      if(c[i-1]<=c[i]){
        idx=i;
        break;
      }
    }
    if(idx==0){
      System.out.println(-1);
      return;
    }
    char min = 'z';
    for(int i=idx;i<26;i++){
      if(c[idx-1]<c[i]&&c[i]<min){
        min=c[i];
      }
    }
    for(int i=0;i<idx-1;i++)System.out.print(c[i]);
    System.out.println(min);
  }
}