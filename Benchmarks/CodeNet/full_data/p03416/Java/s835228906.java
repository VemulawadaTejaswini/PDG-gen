import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    String c[] = new String [5];
    int count = 0;
    int n = b - a; 
    for(int i = 0;i <= n;i++){
      String s = String.valueOf(a);
      c = s.split("");
      if(c[0].equals(c[4]) && c[1].equals(c[3])){
        count++;
      }
      a++;
    }
    System.out.println(count);
  }
}