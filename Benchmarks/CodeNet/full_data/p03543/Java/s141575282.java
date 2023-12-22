import java.util.*;

class Main{
  public static void main(String[] args){
    try(Scanner sc = new Scanner(System.in)){
      String n = sc.next();
      int flag = 0;
      for(int i = 0; i < 3; i++){
        if(n.substring(i, i+1).equals(n.substring(i + 1, i + 2))){
          flag++;
        }
      }
      if(flag >= 2){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
  }
}