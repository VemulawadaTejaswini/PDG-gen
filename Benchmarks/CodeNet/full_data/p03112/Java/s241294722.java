import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int a=scan.nextInt();
    int b=scan.nextInt();
    int q=scan.nextInt();
    long s[]=new long[a];
    long t[]=new long[b];
    long x[]=new long[q];
    
    long min;
    long u,v;
    
    for(int i=0;i<a;i++){
      s[i]=scan.nextLong();
    }
    for(int i=0;i<b;i++){
      t[i]=scan.nextLong();
    }
    for(int i=0;i<q;i++){
      x[i]=scan.nextLong();
    }
    long c;
    long d;
    long e;
    long f;
    for(int i=0;i<q;i++){
      c=1145148101919L;
      d=1145148101919L;
      e=1145148101919L;
      f=1145148101919L;
      for(int j=0;j<a;j++){
        if(x[i]>=s[j]){
          c=Math.min(c,x[i]-s[j]);
        }else{
          d=Math.min(d,s[j]-x[i]);
        }
      }
      for(int j=0;j<b;j++){
        if(x[i]>=t[j]){
          e=Math.min(e,x[i]-t[j]);
        }else{
          f=Math.min(f,t[j]-x[i]);
        }
      }
      min=Math.min(Math.max(c,e),Math.max(d,f));
      u=Math.min(c+c+f,c+f+f);
      v=Math.min(d+d+e,d+e+e);
      u=Math.min(u,v);
      min=Math.min(min,u);
      System.out.println(min);
    }
  }
}
