import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a,b,k,r,num;
    a = sc.nextInt();
    b = sc.nextInt();
    k = sc.nextInt();
    if(a==1&&b==1)
      System.out.println(1);
    if(a<b){
      num = a;
      a = b;
      b = num;
    }
    r = a%b;
    while(r!=0){
      a = b;
      b = r;
      r = a%b;
    }
    if(k=1)
      System.out.println(b);
    int x = 0,j = 1;
    for(int i=2;i<=b;i++){
      int c;
      c = b%i;
      if(c==0){
        j++;
        x = i;
        if(j==k){
          System.out.println(b/x);
          break;
        }
      }
    }
  }
}
