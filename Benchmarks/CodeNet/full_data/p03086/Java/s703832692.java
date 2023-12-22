import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int count = 1;
    int max = 1;
    
    for(int i = 0 ; i < s.length() ; ++i){
      if('A'==(s.charAt(i))||'C'==(s.charAt(i))||
        'G'==(s.charAt(i))||'T'==(s.charAt(i))){
        for(int j = i+1 ; j < s.length() ; ++j){
          if('A'==(s.charAt(j))||'C'==(s.charAt(j))||
             'G'==(s.charAt(j))||'T'==(s.charAt(j))){
            count +=1;
          }else{
            break;
          }
        }
        if(max<count){
          max = count;
        }
      count = 1;
      }
     
    }
    if(max == 1){
      System.out.println(0);
    }else{
      System.out.println(max);
    } 
  }
}