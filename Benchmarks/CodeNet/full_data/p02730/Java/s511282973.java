import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    boolean flag=true;
    for(int i=0;i<s.length()/2;i++){
      if(s.charAt(i)!=s.charAt(s.length()-1-i)){
        flag = false;
        break;
      }
    }
    if(flag==true){
      for(int i=0;i<(s.length()-1)/4;i++){
      	if(s.charAt(i)!=s.charAt(s.length()/2-1-i)){
       	 flag = false;
         break;
     	 }
      }
    }
    int n=s.length();
    if(flag==true){
      for(int i=0;i<(n-(n+3)/2)/2;i++){
      	if(s.charAt(i+(n+3)/2-1)!=s.charAt(n-1-i)){
       	 flag = false;
         break;
     	 }
      }
    }
    if(flag == true) System.out.println("Yes");
    else System.out.println("No");
  }
}