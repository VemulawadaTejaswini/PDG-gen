import java.util.*;
import static java.lang.System.*;
public class Main {
    public static boolean oneFlg = true;
    public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      int btn1V = sc.nextInt();
      int btn2V = sc.nextInt();
      int sumM = 0;
      int max = comp(btn1V,btn2V);
      sumM = sumM + max;
      max--;
      if(!oneFlg){
          sumM = sumM + comp(max,btn2V);
      } else {
          sumM = sumM + comp(btn1V,max);
      }
      out.println(sumM);
        
    }
    //二つの値のうち、大きい値を求める。同じ値なら、v1を返す
    public static int comp(int v1,int v2){
        if(v1 <= v2){
            oneFlg = true;
            return v2;
        } else if(v1 > v2){
            oneFlg = false;
            return v1;
        }
        return -1;
    }
}
