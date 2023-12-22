import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    String s =  sc.next();;
    int result = 0;
    int ss = s.length();
    
    if(("-").equals(s.charAt(a+1))){
      result +=1;
    }
       
    for(int i = 0; i < ss; ++i){
      if(Character.isDigit(s.charAt(i))){
        result +=1;
      }
    }
       
    if((result == ss-1) && (ss==(a+b+1))){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}