import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str1 = sc.next();
    String str2 = sc.next();
    boolean test = false;

    for(int i=0; i<str2.length(); i++){
      if(str2.equals(str1)){
      test = true;
      break;
    }else{
        str1 = str1.charAt(str1.length()-1) + str1;
        str1 = str1.substring(0,str1.length()-1);
      }
    }
      if(test){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
  }
}