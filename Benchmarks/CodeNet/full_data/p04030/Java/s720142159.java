import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    char[] c=sc.next().toCharArray();
    String ans="";
    String bef=ans;
    for(int i=0;i<c.length;i++){
      switch(c[i]){
        case '0':
          bef=ans;
          ans+="0";
          break;
        case '1':
          bef=ans;
          ans+="1";
          break;
        case 'B':
          char[] d=ans.toCharArray();
          d[d.length-1]=' ';
          ans=String.valueOf(d);
          break;
      }
    }
    System.out.println(ans);
  }
}