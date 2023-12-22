import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int n = 0;
    for(i=0;i<2;i++){
      if(a<=b){
        n += a;
      }else{
        n += b;
      }
    } 
    System.out.println(n);
  }
}





