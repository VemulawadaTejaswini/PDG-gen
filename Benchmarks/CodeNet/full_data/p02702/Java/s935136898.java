import java.util.*;

public class Main {
  public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          String str = sc.next();
          int lee = Long.parseLong(str);
          int count = 0;
          long num2 = 0;
          for(int i = 0; i < lee; i++){
            for(int j = i+1; j <= lee; j++) {
              num2 = Long.parseLong(str.substring(i, j));
          if( num2 % 2019 == 0){
            count++;
          }
        }
      }
      System.out.println(count);
          }
        }