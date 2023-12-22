import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int l=sc.nextInt();
    int sum=0;
    if(aji(l,1)*aji(l,n)>0){
        sum -= aji(l,1)>0 ? aji(l,1) : aji(l,n) ;
    }
    for(int i=1;i<=n;i++){
        sum+=aji(l,i);
    }
    System.out.println(sum);
  }
  static int aji(int l,int i){
      return l+i-1;
  }
}
