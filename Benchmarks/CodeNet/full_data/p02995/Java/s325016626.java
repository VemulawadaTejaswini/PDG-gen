import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = Long.parseLong(sc.next());
    long b = Long.parseLong(sc.next());
    long c = Long.parseLong(sc.next());
    long d = Long.parseLong(sc.next());
    long g;
    if(c>=d){
      g = gcd(c,d);
    }else{
      g = gcd(d,c);
    }
    long l = (c/g)*(d/g)*g;
    long cnt1 = b/c-(a+c-1)/c;
    long cnt2 = b/d-(a+d-1)/d;
    long cnt3 = b/l-(a+l-1)/l;
    if(cnt1<0){
      cnt1 = 0;
    }else{
      cnt1++;
    }
    if(cnt2<0){
      cnt2 = 0;
    }else{
      cnt2++;
    }
    if(cnt3<0){
      cnt3 = 0;
    }else{
      cnt3++;
    }
    
    System.out.println(b-a+1-(cnt1+cnt2-cnt3));
    System.out.flush();
  }
  
  public static long gcd(long a,long b){
    if(b==0){
      return a;
    }else{
      return gcd(b,a%b);
    }
  }
}