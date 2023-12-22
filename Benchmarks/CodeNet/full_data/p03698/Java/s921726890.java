import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    HashSet<String> hs = new HashSet<String>();
    int orglen = s.length();
    for(int i = 0;i<orglen;i++){
      hs.add(s.substring(i,i+1));
    }
    int aftlen = hs.size();
    if(orglen == aftlen){
      System.out.println("yes");
    }else{
      System.out.println("no");
    }
  }
}
