import java.util.*;
class Main{
  public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	String s = stdIn.next();
    int ok=0;
    for(int i=0;i<s.length();i++){
      if(s.charAt(i)=='U'||s.charAt(i)=='D'){
        ok++;
      }
      if(i%2==0){
        if(s.charAt(i)=='R'){
          ok++;
        }
      }else{
        if(s.charAt(i)=='L'){
          ok++;
        }
      }
    }
    if(ok==s.length()){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
        
        