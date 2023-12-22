import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int r = sc.nextInt();
    int s = sc.nextInt();
    int p = sc.nextInt();
    char[] c = sc.next().toCharArray();
    int score = 0;
    Map<String,Integer> map = new HashMap<>();
    map.put("r",p);
    map.put("s",r);
    map.put("p",s);
    int num = 0;
    for(int i=0;i<k;i++){
      int cnt = 1;
      for(int j=i+k;j<n;j+=k){
        if(c[j-k]!=c[j]){
          int x = (cnt+1)/2;
          score+=map.get(String.valueOf(c[j-k]))*x;
          cnt=1;
        }
        else cnt++;
        num=j;
      }
      score+=map.get(String.valueOf(c[num]))*((cnt+1)/2);
    }
    System.out.println(score);
  }
}