import java.util.*;
class Main {
     public static void main(String[] args){

         // スキャナーで取得
         Scanner scanner = new Scanner(System.in);
         String str = scanner.nextLine();

         // ABC を BCAに 置換
         str.replace("ABC", "BCA");

         String sum[] = str.split("BCA",0);

         System.out.println(sum.length);

     }
}