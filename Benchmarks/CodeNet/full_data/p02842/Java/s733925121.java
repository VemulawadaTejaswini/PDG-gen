import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      double n = Double.parseDouble(sc.next());

      double x = n/1.08;

      int nnn = (int)x;

      for(int i=nnn;i<=nnn+1;i++){
        int yen = (int)(i*1.08);
        if(yen==(int)n){
          System.out.println(i);
          break;
        }
        else if(i==nnn+1){
          System.out.println(":(");
          break;
        }
      }

    }
}
