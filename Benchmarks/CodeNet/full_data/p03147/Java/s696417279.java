import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int ple=sc.nextInt();
    int ans=ple;
    int cur;
    for(int i=1;i<n;i++){
      cur=sc.nextInt();
      ans+=Integer.max(cur-ple,0);
      ple=cur;
    }
    System.out.println(ans);
  }
}