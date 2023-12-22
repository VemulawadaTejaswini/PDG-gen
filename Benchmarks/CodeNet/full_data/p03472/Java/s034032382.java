import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int h = sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];
    int maxA = 0;
    int cnt = 0;
    for(int i = 0;i < n;i++){
      a[i]=sc.nextInt();
      b[i]=sc.nextInt();
      maxA = Math.max(maxA,a[i]);
    }
    ArrayList<Integer> list = new ArrayList<Integer>();
    for(int i = 0;i < n;i++){
      if(b[i]>maxA)list.add(b[i]);
    }
    Collections.sort(list,Collections.reverseOrder());
    while(h>0&&list.size()!=0){
      h-=list.get(0);
      cnt++;
      list.remove(0);
    }
    if(h<=0){
      System.out.println(cnt);
      return;
    }
    while(h>0){
      h-=maxA;
      cnt++;
    }
    System.out.println(cnt);
  }
}