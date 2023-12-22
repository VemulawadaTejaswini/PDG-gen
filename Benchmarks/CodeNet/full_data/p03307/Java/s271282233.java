import java.util.*;
import static java.lang.System.*;
public class Main {
    public static boolean oneFlg = true;
    public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int no;
      for(int i =1;i <= 2*n;i++){
          no = i;
          if(i % 2 ==0 && i % n ==0){
              out.println(i);
          }
      }
        
    }
}
