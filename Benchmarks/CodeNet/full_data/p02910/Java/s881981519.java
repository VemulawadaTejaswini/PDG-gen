import java.util.Scanner;

public class Main{
  public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    int len = str.length();
    int cnt1 = 0;
    int cnt2 = 0;
    for(int i = 0; i < len  ;i += 2){
      char n = str.charAt(i);
      if(n.equal('R') == true || n.equal('U') == true || n.equal('D') == true){
      	cnt1 += 1;
      }
    }
     for(int i = 1; i < len  ;i += 2){
      String n = str.charAt(i);
      if(n.equal('L') == true || n.equal('U') == true || n.equal('D') == true){
      	cnt2 += 1;
      }
    }
    if(cnt1 == (len/2) || cnt2 == (len/2 + len%2)){
      System.out.println("Yes");
    }else{
    	System.out.println("No");
    }
    
  }
}
