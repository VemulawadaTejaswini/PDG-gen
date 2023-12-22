import java.util.*;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int i,j;
    for(i=0;i<s.length();i++) {
      if (s.charAt(i)=='A') break;
      }
    for(j=s.length()-1;j>=0;j--) {
      if(s.charAt(j)=='Z') break;
    }    
    System.out.println(j-i+1);
    
  }
}
