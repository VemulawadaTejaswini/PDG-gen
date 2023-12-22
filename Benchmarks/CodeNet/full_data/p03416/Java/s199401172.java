import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int count = 0;
    for(int i=a;i<=b;i++){
      String n = Integer.toString(i);
      boolean flag = true;
      for(int j=0;j<n.length()/2;j++){
        char c1 = n.charAt(j);
        char c2 = n.charAt(n.length() - j -1);
        if(c1 != c2){
          flag = false;
          break;
        }
      }
      if(flag) count++;
    }
    System.out.println(count);
  }
}
