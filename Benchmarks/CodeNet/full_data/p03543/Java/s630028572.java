import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    String nn = n;
    int len = 0;
    int lenans = 0;
    for(int i = 0;i < 10;i++){
      nn.replace(i,"");
      len = nn.length();
      if(len > lenans){
        lenans = len;
      }
      if(lenans > 2){
        break;
      }
      nn = n;
    }
    if(lenans > 2){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
