import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String s = sc.next();
      char x = s.charAt(0);
      int count=1;
      for(int i=0;i<n;i++){
        if(x!=s.charAt(i)){
          x = s.charAt(i);
          count++;
        }
      }     
        System.out.println(count);
    }
}