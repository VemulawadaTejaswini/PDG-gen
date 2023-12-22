import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int cnt=0;
    int max=0;
    boolean han=false;
    int n=sc.nextInt();
    String bl[]=new String[n];
    for(int i=0;i<n;i++) bl[i]=sc.next();
    int m=sc.nextInt();
    String re[]=new String[m];
    for(int i=0;i<m;i++) re[i]=sc.next();
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++) if(bl[i]==bl[j]) cnt++;
      if(cnt==n||cnt==0) han=true;
      for(int a=0;a<m;a++) if(bl[i]==re[a]) cnt--;
      if(cnt>max) max=cnt;
    }
    if(han==true) System.out.println(cnt);
    else System.out.println("1");
  }
}