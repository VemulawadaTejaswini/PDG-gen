import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    int i = 1;    
    while(true){
      if(s==1 || s==2 || s==4){
        break;
      } else if(s % 2 == 0){
        i++;
        s /= 2;
      } else {
        i++;
        s = s*3 + 1;
      }
    }
    System.out.println(i+3);
  }
}