import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
      if(n/100>12 && n%100>=1 && n%100<=12){
        System.out.println("YYMM");
      }else if(n%100>12 && n/100>=1 && n/100<=12){
        System.out.println("YYMM");
      }else if(n%100==0 || n/100==0 || (n%100>12 && n/100>12)){
        System.out.println("NA");
      }else {
        System.out.println("AMBIGUOUS");
      }        
        // 出力
       
    }
}
