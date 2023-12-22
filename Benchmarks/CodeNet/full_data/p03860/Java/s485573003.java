import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str[] = new String[3];
    for(int i=0;i<3;i++){
      str[i] = sc.next();
    }
    
    str[1] = str[1].substring(0,1);
    
    System.out.println("A" + str[1] + "C");
    
  }
}