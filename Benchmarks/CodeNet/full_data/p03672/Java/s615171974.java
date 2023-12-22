import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	String s=sc.next();
    int n=s.length();
    for(int i=0;i<s.length();i+=2){
      String a=s.substring(0,n/2),b=s.substring(n/2,n);
      if(a.equals(b)){
        System.out.println(n);
        break;
      }
      s=s.substring(0,n-2);
      n=s.length();
    }
  }
}
