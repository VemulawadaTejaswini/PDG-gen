import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    StringBuffer s[]=new StringBuffer[n];
    String ss[]=new String[n];
    for(int i=0;i<n;i++){
      s[i]=new StringBuffer(sc.next());
    }
    
    for(int i=0;i<n;i++){
      for(int j=1;j<10;j++){
        for(int k=j;k>0;k--){
          if(s[i].charAt(k)<s[i].charAt(k-1)){
            char t=s[i].charAt(k);
            s[i].setCharAt(k,s[i].charAt(k-1));
            s[i].setCharAt(k-1,t);
          }
        }
      }
      ss[i]=new String(s[i]);
    }
    Arrays.sort(ss);
    
    long sum=0;
    long kk=0;
    long sk=0;
    while(kk<n){
        kk=calc(ss,n,sk);
        sum+=( ((kk-sk)*((kk-sk)-1))/2 );
        sk=kk;
    }
    sum+=( ((kk-sk)*((kk-sk)-1))/2 );
    System.out.println(sum);
  }
  static int calc(String[] ss,int n,long f){
    for(int i=f+1;i<n;i++){
      if(!ss[f].equals(ss[i])){
        return i;
      }
    }
    return n;
  }
}