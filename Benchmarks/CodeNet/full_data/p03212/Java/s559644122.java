import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String x = sc.next();
    int count = 0;
    String str = x;
    int[] stg = {3,7,5};
    int c = Integer.parseInt(x);

    if(c < 357){
        System.out.println("0");
    }else{
        for(int i = 355;i <= c;i += 2){
            String s = String.valueOf(i);
            if((s.contains("3") & !(s.contains("5") & s.contains("7")) & (s.contains("0") | s.contains("1") | s.contains("2") | s.contains("4") | s.contains("6") | s.contains("8") | s.contains("9"))){
                count++;
            }
        }
        System.out.println(count);
    }
  }
}