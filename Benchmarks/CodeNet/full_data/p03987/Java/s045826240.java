import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n+1];
    TreeSet<Integer> ts = new TreeSet<>();
    for(int i=1;i<=n;i++)a[sc.nextInt()]=i;
    long ans = 0;
    ts.add(0);
    ts.add(n+1);
    for(int i=1;i<=n;i++){
      ts.add(a[i]);
      ans+=(long)i*(ts.higher(a[i])-a[i])*(a[i]-ts.lower(a[i]));
    }
    System.out.println(ans);
  }
}