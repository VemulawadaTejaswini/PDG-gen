import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int p[] = new int[a];
    int q[] = new int[b];
    int r[] = new int[c];
    for(int i = 0;i<a;i++){
      p[i] = sc.nextInt();
    }
    Arrays.sort(p);
    for(int i = 0;i<b;i++){
      q[i] = sc.nextInt();
    }
    Arrays.sort(q);
    for(int i = 0;i<c;i++){
      r[i] = sc.nextInt();
    }
    Arrays.sort(r);

    int del[] = new int[x + y];
    for(int i = 0;i<x;i++){
      del[i] = p[a-1-i];
    }
    for(int i = 0;i<y;i++){
      del[x+i] = q[b-1-i];
    }
    Arrays.sort(del);
    for(int i = 0;i<c;i++){
      if(r[i] > del[0]){
        del[0] = r[i];
      }
      Arrays.sort(del);
    }
    int ans = 0;
    for(int i = 0;i<x+y;i++){
      ans += del[i];
    }
    System.out.println(ans);

  }
}
