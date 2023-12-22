import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char[] c = sc.next().toCharArray();
    long len = (long)c.length;
    long ans = (len*(len-1))/2;
    for(char x='a';x<='z';x++){
      long cnt = 0;
      for(int i=0;i<len;i++){
        if(c[i]==x)cnt++;
      }
      ans-=(cnt*(cnt-1))/2;
    }
    System.out.println(ans+1);
  }
}
