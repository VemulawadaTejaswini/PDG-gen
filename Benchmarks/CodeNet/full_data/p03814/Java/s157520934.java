import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int first=0,end=0;
    for(int i=0;i<s.length();i++){
      if(s.charAt(i)=='A'){
        first=i;
        break;
      }
    }
    for(int i=s.length()-1;i>=0;i--){
      if(s.charAt(i)=='Z'){
        end=i;
        break;
      }
    }
    System.out.println(end-first+1);
  }
}