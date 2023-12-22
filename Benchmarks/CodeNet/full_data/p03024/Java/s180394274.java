import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        String str = sc.next();
      	char target = 'x';
 
      int count = 0;
      for(char x:str.toCharArray()){
        if(x == target) {
          count++;
        }
      }
      
    // 出力

      
      if(count<=7){
              System.out.println("YES");
      }
      else{
        System.out.println("NO");
    }
    }
}
