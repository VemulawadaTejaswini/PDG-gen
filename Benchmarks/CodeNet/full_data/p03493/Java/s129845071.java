import java.util.*;

class Main{
    public static  void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int s = sc.nextInt();
      int s1 = s /100;
      int s2 = (s - s1 * 100) /10;
      int s3 = s - s1 * 100 - s2 * 10;
      int n = 0;
      if (s1 == 1){
        n += 1;
      }
      if (s2 == 1){
        n += 1;
      }
      if (s3 == 1){
        n += 1;
      }

      System.out.println(n);





    }
}
