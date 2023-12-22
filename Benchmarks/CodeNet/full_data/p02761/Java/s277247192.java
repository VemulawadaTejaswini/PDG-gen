import java.util.*;

class Main{
  static int from(int n){
    if(n==1){
      return 0;
    }else if(n==2){
      return 10;
    }
    return 100;
  }
  static int to(int n){
    if(n==1){
      return 9;
    }else if(n==2){
      return 99;
    }
    return 999;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[] s=new int[m];
    int[] c=new int[m];
    for(int i=0;i<m;i++){
      s[i]=sc.nextInt()-1;
      c[i]=sc.nextInt()+'0';
    }
    for(int i=from(n);i<=to(n);i++){
      boolean flag=true;
      for(int j=0;j<m;j++){
        if(String.valueOf(i).charAt(s[j])!=c[j]){
          flag=false;
        }
      }
      if(flag){
        System.out.println(i);
        return;
      }
    }
    System.out.println(-1);
  }
}