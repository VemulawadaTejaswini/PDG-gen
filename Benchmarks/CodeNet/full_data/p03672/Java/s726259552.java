import java.util.*;
import java.math.BigInteger;
class Main{

     public static void main(String []args){
      Scanner scan = new Scanner(System.in);
      String s = scan.next() ;
      int i = 0 ;
      while(s.length()!=0){
          s = s.substring(0,s.length()-1);
          //System.out.println(s);
          if(s.substring(0,(s.length()/2)).equals(s.substring(s.length()/2,s.length()))){
              System.out.println(s.length());
              break;
          }
          i++;
      }
    }
}