import java.util.Scanner;
public class Main{

   public static void main(String[] args){
      new Main().solve();
   }

   public void solve(){
      Scanner scanner = new Scanner(System.in);
      long x = scanner.nextLong();
      long y = scanner.nextLong();
      long btnCount = 0;
      if(Math.abs(x) == Math.abs(y)){
        btnCount = 1;
      }else if(Math.abs(x) > Math.abs(y)){
         if(x >= 0){
            btnCount = Math.abs(x)-Math.abs(y);
            if(y >= 0) btnCount += 2;
            else btnCount += 1;
         }else{
            btnCount = y-x;
         }
      }else{
         if(x >= 0){
            if(y >= 0) btnCount = y-x;
            else btnCount = Math.abs(y)-x+2;
         }else{
            if(y >= 0) btnCount = y-Math.abs(x)+2;
            else btnCount = x-y+2;
         }
      }
      System.out.println(btnCount);

   }


}
