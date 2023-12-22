import java.util.*;


public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      //長さ4の文字列
      String date = sc.nextLine();
      //後ろの二文字
      String str1 = date.substring(2);
      //前の二文字
      String str2 = date.substring(0,2);
      
      //後ろの二文字を数字化する
      int month = Integer.parseInt(str1);
      
      if(month >= 1 && month <= 12){
        //前の二文字を数字化する
        int month1 = Integer.parseInt(str2);
        if(month1 >= 1 && month1 <= 12){
          System.out.print("AMBIGUOUS");
        }else{
          System.out.print("YYMM");
        }
      }else{
          int month1 = Integer.parseInt(str2);
          if(month1 >= 1 && month1 <= 12){
            System.out.print("MMYY");
          }else{
            System.out.print("NA");
          }
      }
    }
}
