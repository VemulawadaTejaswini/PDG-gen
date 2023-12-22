import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String a[]=new String[n];
    int m=sc.nextInt();
    String b[]=new String[m];
    int cnt=0;
    for(int i=0;i<n;i++){
      a[i]=sc.next();
    }
    for(int i=0;i<m;i++){
      b[i]=sc.next();
    }
    sc.close();
    for(int i=0;i<n-m+1;i++){
      if(a[0].indexOf(b[0],i)==0){
        cnt=0;
        for(int j=0;j<m;j++){
          if(a[j].indexOf(b[j],i)==0){
            cnt++;
            if(cnt==m){
              break;
            }
          }
        }
      }
    }
    if(cnt==m){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}