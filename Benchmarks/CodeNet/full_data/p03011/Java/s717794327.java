import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int data[]  = new int[3];
      int min = 0;

      for(int i = 0;i<3;i++){
        data[i] = sc.nextInt();
      }

      Arrays.sort(data);

      System.out.println(data[0] + data[1]);


}
}
