import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for (int i=0;i<n;i++) {
      a[i]=sc.nextInt();
    }
    int ans=0;
    for (int i=0;i<n-1;i++) {
      for (int j=i+1;j<n;j++) {
        if(a[i]==a[j]) ans++;
      }
    }

    if(ans==0){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}
