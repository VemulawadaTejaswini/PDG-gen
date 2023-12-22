import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int a = sc.nextInt();
      int b = sc.nextInt();

      int[] ans = new int[3];

      int anss = -201;

      ans[0] = a + b;
      ans[1] = a - b;
      ans[2] = a * b;

      for(int j=0;j<3;j++){
        if(ans[j]>anss){
          anss=ans[j];
        }
      }



      System.out.println(anss);

    }
}
