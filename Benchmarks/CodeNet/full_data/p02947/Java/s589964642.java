import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    StringBuilder s[]=new StringBuilder[n];
    String ss[]=new String[n];
    for(int i=0;i<n;i++){
      s[i]=new StringBuilder(sc.next());
    }
    
    for(int i=0;i<n;i++){
      for(int j=1;j<10;j++){
        for(int k=j;k>0;k--){
          if(s[i].charAt(k)>s[i].charAt(k-1)){
            char t=s[i].charAt(k);
            s[i].setCharAt(k,s[i].charAt(k-1));
            s[i].setCharAt(k-1,t);
          }
        }
      }
      ss[i]=new String(s[i]);
    }
    int sum=0;
    for(int i=0;i<n-1;i++){
      for(int j=i+1;j<n;j++){
        if(ss[i].equals(ss[j])){
          sum++;
        }
      }
    }
    System.out.println(sum);
  }
}