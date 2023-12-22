import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int count= 0;
    for(int i = 0;i<s.length()/2;i++){
      if(!(s.substring(i,i+1).equals(s.substring(s.length()-i-1,s.length()-i)))){
        count++;
      }
    }
    System.out.println(count);
  }
}
