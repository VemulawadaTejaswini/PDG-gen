import java.util.*;
 
class Main {
 
    public static void main(String[] args) {
 
      //入力値取得
      Scanner in = new Scanner(System.in);
      String s = in.next();
      
      //入力値によって出力する天気を変更する
      switch(s){
        case"SUN":
          System.out.println(7);
          break;
       	case"MON":
          System.out.println(6);
          break;
        case"TUE":
          System.out.println(5);
          break;
        case"WED":
          System.out.println(4);
          break;
       	case"THU":
          System.out.println(3);
          break;
        case"FRI":
          System.out.println(2);
          break;
        case"SAT":
          System.out.println(1);
          break;
        default:
          System.out.println(0);
        }
    }
}