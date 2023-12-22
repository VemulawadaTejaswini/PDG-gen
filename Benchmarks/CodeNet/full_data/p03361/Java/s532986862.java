import java.util.*;
public class Main{
  public static void main(String[] args){
    String ans = "Yes";
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    String[] s = new String[h+2];
    StringBuilder buf = new StringBuilder();
    for (int i = 0; i<w+2;i++){
      buf.append(".");
    }
    s[0] = buf.toString();
    for (int i = 1 ; i < h+1;i++){
      s[i] = "." + sc.next() + ".";
    }
    s[h+1] = buf.toString();
    
    for (int i = 1;i < h+1;i++){
      for (int j = 1;j < w+1;j++){
        if ("#".equals(s[i].substring(j,j+1))){
          if ("#".equals(s[i+1].substring(j,j+1))||
                "#".equals(s[i-1].substring(j,j+1))||
                "#".equals(s[i].substring(j+1,j+2))||
                "#".equals(s[i].substring(j-1,j))){
            break;
          }
          ans = "No";
        }
      }
    }
    System.out.println(ans);
  }
}