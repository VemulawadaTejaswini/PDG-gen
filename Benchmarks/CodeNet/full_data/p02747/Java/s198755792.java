import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    String s =sc.next();
    String S[] =s.split("",0);
    if(s.length()%2==1){System.out.println("No");}
    for(int i=0;i<s.length();i++){
      if(i%2==0){if(S[i].equals("h")){continue;}
                 else{System.out.println("No");System.exit(0);}}
      if(i%2==1){if(S[i].equals("i")){continue;}
                 else{System.out.println("No");System.exit(0);}}}
    System.out.println("Yes");
  }
}
