import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);  
    int n = sc.nextInt();
    int m = sc.nextInt();
    int x[] = new int[n+1];
    int y[] = new int[m+1];
    x[0] = sc.nextInt();
    y[0] = sc.nextInt();
 
    for(int i=1;i<=n;i++){
      x[i] = sc.nextInt();
    }
    for(int i=1;i<=m;i++){
      y[i] = sc.nextInt();
    }
    Arrays.sort(x);
    Arrays.sort(y);
    if(x[x.length-1]<y[0])
      System.out.println("No War");
    else
      System.out.println("War");
  }
}