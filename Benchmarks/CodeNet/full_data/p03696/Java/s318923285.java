import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String s=sc.next();
    int max=0;
    int begin=0;
    int end=0;
    for(int i=0;i<n;i++){
      if(s.charAt(i)=='(')begin++;
      else end++;
      max=Math.max(max,end-begin);
    }
    String ans="";
    for(int i=0;i<max;i++)ans+='(';
    ans+=s;
    for(int i=0;i<max+begin-end;i++)ans+=')';
    System.out.println(ans);
  }
}
