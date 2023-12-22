import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a,b,k,r,num;
    a = sc.nextInt();
    b = sc.nextInt();
    k = sc.nextInt();
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
    int x = 0;
    for(int j=1;j<k; ){
      for(int i=2;i<=b;i++){
        int c;
        c = b%i;
        if(c==0){
          k++;
          x = i;
        }
      }
    }
    System.out.println(b/x);
  }
}