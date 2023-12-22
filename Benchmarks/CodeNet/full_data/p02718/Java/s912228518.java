import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(),m = sc.nextInt();
    int a[]=new int[n];
    int sum=0;
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
      sum+=a[i];
    }
    Arrays.sort(a);
    boolean flg=true;
    for(int i=0;i<m;i++){
      if(a[n-i-1]<sum/4.0/m){
        flg=false;
        break;
      }
    }
    if(flg){
      pl("Yes");
    }else{
      pl("No");
    }
  }

  public static void pr(String str){
    System.out.print(str);
  }
  public static void pl(String str){
    System.out.println(str);
  }
}
