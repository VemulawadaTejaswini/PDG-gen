import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    
    int a = 0;
    for(int i=0;i<3;i++){
      if(s.charAt(i) =='A')
        a += 1;
    }
    if(a == 0|| a==3)
      System.out.println("No");
    else
      System.out.println("Yes");
  }
}