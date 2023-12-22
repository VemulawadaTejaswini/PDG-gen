import java.util.*;
import java.io.*;
public class Main{
  public static void main(String[] args) throws Exception{
Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int length = s.length();
    int i = (length-1)/2-1;
    int j = (length+3)/2-1;
    boolean flag = false;
    if(isPalindrome(s,0,length-1) && isPalindrome(s,0,i) && isPalindrome(s,j,length-1)){
      System.out.println("Yes");
      flag = true;
    }  
    if(!flag){
      System.out.println("No");
    }
  
  
  
  }
  
    public static boolean isPalindrome(String s,int i,int j){
      while(i<=j){
        if(s.charAt(i)!=s.charAt(j)){
          return false;
        }
        i++;
        j--;
      
    }
      if(i>j){
        return true;
      }
    return false;
      
}
  }
