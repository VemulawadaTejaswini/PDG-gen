import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    long sum=0;
    for(int i=1;i<=k;i++){
      for(int j=1;j<=k;j++){
        for(int ij=1;ij<=k;ij++){
          sum+=gcd(gcd(i,j),ij);
        }
      }
    }
    pl(sum+"");
  }

  public static int gcd(int a,int b){
    if(a<b){
      int aa=a;a=b;b=aa;
    }
    while(a%b!=0){
      int c=a%b;
      a=b;b=c;
    }
    return b;
  }

  public static void pr(String str){
    System.out.print(str);
  }
  public static void pl(String str){
    System.out.println(str);
  }
}
