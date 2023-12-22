import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String even="",odd="";
    for(int i = 0;i<s.length();i++){
      if(i%2==0){
        odd+=s.substring(i,i+1);
      }else{
        even+=s.substring(i,i+1);
      }
    }
    int ok = 0;
    odd=odd.replace("R","");
    odd=odd.replace("U","");
    odd=odd.replace("D","");
    even=even.replace("L","");
    even=even.replace("U","");
    even=even.replace("D","");
    if(odd.length()==0)ok++;
    if(even.length()==0)ok++;
    if(ok==2){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
