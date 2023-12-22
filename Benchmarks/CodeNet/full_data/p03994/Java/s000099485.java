import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    StringBuilder sb=new StringBuilder(s);
    int n=sc.nextInt();
    for(int i=0;i<s.length();i++){
      if(n==0){
        break;
      }
      if(n>='z'+1-sb.charAt(i)){
        n-=('z'+1-sb.charAt(i));
        sb.setCharAt(i,'a');
      }
    }
    n=(n%26);
    if(n>0){
      char last=sb.charAt(sb.length()-1);
      int neww=((last-'a'+n)%26)+'a';
      sb.setCharAt(
        sb.length()-1,
        (char)neww
      );
    }
    System.out.println(sb);
  }
}